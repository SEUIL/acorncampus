//------------------------------------------------------------------------------------------------
// 1. 파일 클릭 시 하이라이트 기능
const link02 = document.querySelectorAll(".file-list a");

link02.forEach((link) => {
  link.addEventListener("click", function () {
    // 모든 링크의 active 클래스 제거
    link02.forEach((l) => l.classList.remove("active"));
    // 클릭한 링크에 active 클래스 추가
    this.classList.add("active");

    // [추가] 코드 보기 탭을 위해 소스 코드 불러오기
    const fileUrl = this.getAttribute("href");
    loadSourceCode(fileUrl);
  });
});

//------------------------------------------------------------------------------------------------
// 2. 사이드바 리사이징 기능
const sidebar = document.getElementById("sidebar");
const resizer = document.getElementById("resizer");
const iframe = document.querySelector("iframe"); // iframe 요소 선택

let isResizing = false;

// 마우스를 눌렀을 때 (드래그 시작)
resizer.addEventListener("mousedown", (e) => {
  isResizing = true;
  resizer.classList.add("resizing"); // 파란색 효과 유지
  document.body.style.cursor = "col-resize"; // 커서 모양 고정
  document.body.style.userSelect = "none"; // 드래그 중 텍스트 선택 방지

  // 드래그 중에 iframe이 마우스 이벤트를 가로채지 못하도록 설정 (마우스 튕김 방지)
  if (iframe) {
    iframe.style.pointerEvents = "none";
  }
});

// 마우스를 움직일 때 (너비 조절)
document.addEventListener("mousemove", (e) => {
  if (!isResizing) return;

  // 마우스의 X 좌표가 곧 사이드바의 너비가 됨
  let newWidth = e.clientX;

  // 제한 조건 설정
  const minWidth = 130; // 최소 너비 (CSS와 동일하게 맞춤)
  const maxWidth = window.innerWidth * 0.4; // 화면의 40%

  if (newWidth < minWidth) newWidth = minWidth;
  if (newWidth > maxWidth) newWidth = maxWidth;

  sidebar.style.width = `${newWidth}px`;
});

// 마우스를 뗐을 때 (드래그 종료)
document.addEventListener("mouseup", () => {
  isResizing = false;
  resizer.classList.remove("resizing");
  document.body.style.cursor = "default";
  document.body.style.userSelect = "auto";

  // 드래그 종료 후 iframe 상호작용 복구
  if (iframe) {
    iframe.style.pointerEvents = "auto";
  }
});

//------------------------------------------------------------------------------------------------ 
// 3. 탭 전환 및 코드 뷰어 기능
const tabs = document.querySelectorAll(".tab-btn");
const views = document.querySelectorAll(".view-content");

tabs.forEach((tab) => {
  tab.addEventListener("click", () => {
    // 탭 활성화 스타일 변경
    tabs.forEach((t) => t.classList.remove("active"));
    tab.classList.add("active");

    // 뷰 전환
    const targetId = tab.getAttribute("data-target") + "-view";
    views.forEach((view) => view.classList.remove("active"));
    document.getElementById(targetId).classList.add("active");
  });
});

// 4. 테마 변경 기능
const themeSelect = document.getElementById("theme-select");
const highlightLink = document.getElementById("highlight-theme");
const codeView = document.getElementById("code-view");

themeSelect.addEventListener("change", (e) => {
  const theme = e.target.value;
  // Highlight.js 테마 CSS 교체
  highlightLink.href = `//cdnjs.cloudflare.com/ajax/libs/highlight.js/11.7.0/styles/${theme}.min.css`;

  // 다크 테마일 경우 컨테이너 배경색 변경을 위한 클래스 토글
  const isDark = ["vs2015", "atom-one-dark", "monokai"].includes(theme);
  codeView.classList.toggle("dark-theme", isDark);
});

// 소스 코드 불러오기 함수
async function loadSourceCode(url) {
  const htmlCodeBlock = document.getElementById("html-code");
  const extraCodeArea = document.getElementById("extra-code-area");

  try {
    // 1. HTML 파일 내용 가져오기
    const response = await fetch(url); /* 파일을 받아오는 js 내장함수 */
    if (!response.ok) throw new Error("파일을 불러올 수 없습니다.");
    const htmlText = await response.text();

    // HTML 코드 표시 (태그를 문자열로 변환하여 출력)
    htmlCodeBlock.textContent = htmlText;
    // Highlight.js 적용 (HTML)
    htmlCodeBlock.className = "language-html"; // 클래스 초기화 및 언어 지정
    hljs.highlightElement(htmlCodeBlock);

    extraCodeArea.innerHTML = ""; // 기존 CSS/JS 영역 초기화

    // 2. HTML 내부의 CSS(link)와 JS(script) 파일 찾기
    const parser = new DOMParser();
    const doc = parser.parseFromString(htmlText, "text/html");

    // CSS 파일 찾기
    const links = doc.querySelectorAll('link[rel="stylesheet"]');
    for (const link of links) {
      const href = link.getAttribute("href");
      if (href && !href.startsWith("http")) { // 외부 링크 제외
        await fetchAndDisplayCode(url, href, "CSS");
      }
    }

    // JS 파일 찾기
    const scripts = doc.querySelectorAll("script[src]");
    for (const script of scripts) {
      const src = script.getAttribute("src");
      if (src && !src.startsWith("http")) { // 외부 스크립트 제외
        await fetchAndDisplayCode(url, src, "JavaScript");
      }
    }

  } catch (error) {
    htmlCodeBlock.innerText = "코드를 불러오는 중 오류가 발생했습니다.\n(Live Server 환경에서 실행해주세요)";
    console.error(error);
  }
}

// CSS/JS 파일 내용을 가져와서 화면에 추가하는 함수
async function fetchAndDisplayCode(baseUrl, relativePath, type) {
  try {
    // 상대 경로를 절대 경로로 변환
    const absoluteUrl = new URL(relativePath, new URL(baseUrl, window.location.href)).href;
    const response = await fetch(absoluteUrl);
    const text = await response.text();

    // 파일 확장자로 언어 구별
    const extension = relativePath.split('.').pop().toLowerCase();
    let langClass = "language-plaintext";
    if (extension === "css") langClass = "language-css";
    if (extension === "js") langClass = "language-javascript";

    const section = document.createElement("div");
    section.className = "code-section";
    section.innerHTML = `<h3>${type} (${relativePath.split('/').pop()})</h3><pre><code class="${langClass}"></code></pre>`;
    
    const codeElement = section.querySelector("code");
    codeElement.textContent = text;
    hljs.highlightElement(codeElement); // Highlight.js 적용

    document.getElementById("extra-code-area").appendChild(section);
  } catch (e) {
    console.log("추가 파일 로드 실패:", relativePath);
  }
}

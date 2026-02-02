
// 1. 파일 클릭 시 하이라이트 기능
const link02 = document.querySelectorAll(".file-list a");

link02.forEach((link) => {
  link.addEventListener("click", function () {
    // 모든 링크의 active 클래스 제거
    link02.forEach((l) => l.classList.remove("active"));
    // 클릭한 링크에 active 클래스 추가
    this.classList.add("active");
  });
});

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

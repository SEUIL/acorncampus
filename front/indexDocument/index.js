// -----------------------------햄버거 버튼----------------------------------

const toggleBtn = document.querySelector(".menu-toggle-btn");
const navbar = document.querySelector(".navbar");

toggleBtn.addEventListener("click", () => {
  navbar.classList.toggle("active");
});

// -----------------------------Lastes work----------------------------------

// Latest Works 자동 갱신 스크립트
// 하단의 폴더 리스트(folder-group)에서 가장 최근 항목들을 가져와 상단에 표시합니다.
document.addEventListener("DOMContentLoaded", () => {
  // ------------------ 진행률 설정 ------------------
  const progressText = document.getElementById("progress-text");
  const progressFill = document.querySelector(".progress-fill");

  if (progressText && progressFill) {
    // 텍스트 클릭 시 편집 모드로 전환
    progressText.addEventListener("click", function () {
      // 이미 입력창이 떠있다면 중복 실행 방지
      if (this.querySelector("input")) return;

      const currentVal = parseInt(this.innerText) || 0;

      // 입력창 생성 및 스타일 설정
      const input = document.createElement("input");
      input.type = "number";
      input.value = currentVal;
      input.min = 0;
      input.max = 100;
      input.style.width = "50px";
      input.style.fontSize = "1rem";
      input.style.textAlign = "center";

      // 기존 텍스트를 지우고 입력창 추가
      this.innerText = "";
      this.appendChild(input);
      input.focus();

      // 값 적용 함수
      const applyValue = () => {
        let val = parseInt(input.value);
        if (isNaN(val)) val = 0;
        if (val < 0) val = 0;
        if (val > 100) val = 100;

        progressFill.style.width = `${val}%`;
        progressText.innerText = `${val}%`;
      };

      // 포커스를 잃거나(blur), 엔터키(keydown)를 치면 적용
      input.addEventListener("blur", applyValue);
      input.addEventListener("keydown", (e) => {
        if (e.key === "Enter") input.blur();
      });
    });
  }
  // ------------------------------------------------

  const folderGroups = document.querySelectorAll(".folder-group");
  const featuredGrid = document.querySelector(".featured-grid");

  if (folderGroups.length > 0 && featuredGrid) {
    let latestLinks = [];

    // 폴더 그룹을 역순으로 순회 (HTML 구조상 아래쪽 폴더가 최신이라고 가정)
    for (let i = folderGroups.length - 1; i >= 0; i--) {
      const group = folderGroups[i];
      // summary 태그에서 날짜 텍스트 추출 (예: 20260202 -> 20260202)
      const dateText = group
        .querySelector("summary")
        .innerText.replace("📂", "")
        .trim();
      const links = group.querySelectorAll("a");

      // 해당 폴더의 파일들을 역순으로 순회 (아래쪽 파일이 최신이라고 가정)
      for (let j = links.length - 1; j >= 0; j--) {
        const link = links[j];
        latestLinks.push({
          title: link.innerText,
          url: link.href,
          date: dateText,
        });

        if (latestLinks.length >= 3) break; // 3개 모이면 중단
      }
      if (latestLinks.length >= 3) break;
    }

    // 찾은 링크가 있으면 DOM 업데이트
    if (latestLinks.length > 0) {
      featuredGrid.innerHTML = ""; // 기존 하드코딩 내용 제거

      latestLinks.forEach((item) => {
        // 파일명에 따른 아이콘 자동 매핑
        let icon = "📄";
        const lowerTitle = item.title.toLowerCase();
        if (lowerTitle.includes("video") || lowerTitle.includes("동영상"))
          icon = "🎥";
        else if (
          lowerTitle.includes("css") ||
          lowerTitle.includes("style") ||
          lowerTitle.includes("color")
        )
          icon = "🎨";
        else if (
          lowerTitle.includes("js") ||
          lowerTitle.includes("script") ||
          lowerTitle.includes("toggle")
        )
          icon = "⚡";
        else if (lowerTitle.includes("html")) icon = "🌐";
        else if (lowerTitle.includes("form") || lowerTitle.includes("폼"))
          icon = "📝";
        else if (lowerTitle.includes("grid") || lowerTitle.includes("그리드"))
          icon = "▦";

        const card = document.createElement("a");
        card.href = item.url;
        card.target = "_blank";
        card.className = "featured-item";
        card.innerHTML = `
                            <div class="featured-icon">${icon}</div>
                            <div class="featured-info">
                                <h3>${item.title}</h3>
                                <p>${item.date}</p>
                            </div>
                        `;
        featuredGrid.appendChild(card);
      });
    }
  }
});

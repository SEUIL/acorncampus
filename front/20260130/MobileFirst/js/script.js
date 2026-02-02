// toggleBtn에 html에 있는 .menu-toggle-btn을 할당
const toggleBtn = document.querySelector('.menu-toggle-btn');
// nav에 html에 있는 nav를 할당
const nav = document.querySelector('nav');

// 토글 버튼 클릭 시 이벤트를 처리
toggleBtn.addEventListener('click', () => {
    // nav 요소에 'is-open' 클래스를 토글(추가/제거)하여 메뉴를 열거나 닫음
    nav.classList.toggle('is-open');
});
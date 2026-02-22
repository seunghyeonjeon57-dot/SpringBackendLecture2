// static/js/app.js
console.log('Spring Boot static resource loaded!');

// 페이지 로드 시 실행
document.addEventListener('DOMContentLoaded', function() {
    console.log('DOM fully loaded');

    // 동적으로 내용 추가
    const container = document.querySelector('.container');
    const timeElement = document.createElement('p');
    timeElement.textContent = 'Current time: ' + new Date().toLocaleString();
    container.appendChild(timeElement);
});

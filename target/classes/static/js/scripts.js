document.addEventListener('DOMContentLoaded', function() {
    const navLinks = document.querySelectorAll('nav a');
    navLinks.forEach(link => {
        link.addEventListener('click', function(event) {
            event.preventDefault();
            const page = link.getAttribute('href').substring(1);
            loadPage(page);
        });
    });
});

function loadPage(page) {
    fetch(`/views/${page}.html`)
        .then(response => response.text())
        .then(html => {
            document.querySelector('.container').innerHTML = html;
        });
}

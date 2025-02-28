const API_URL = "http://localhost:3008/books"; 
document.getElementById("searchForm").addEventListener("submit", searchBook);

async function searchBook(event) {
    event.preventDefault();

    const id = document.getElementById("searchId").value;
    const message = document.getElementById("searchMessage");
    const result = document.getElementById("searchResult");

    try {
        const response = await fetch(`${API_URL}/${id}`);
        if (!response.ok) throw new Error("Book not found");

        const book = await response.json();
        result.innerHTML = `
            <p><strong>Title:</strong> ${book.title}</p>
            <p><strong>Author:</strong> ${book.author}</p>
            <p><strong>Genre:</strong> ${book.genre}</p>
            <p><strong>Year:</strong> ${book.yearOfPublication}</p>
        `;
        message.textContent = "";
    } catch (error) {
        message.textContent = "Error: " + error.message;
        message.style.color = "red";
        result.innerHTML = "";
    }
}
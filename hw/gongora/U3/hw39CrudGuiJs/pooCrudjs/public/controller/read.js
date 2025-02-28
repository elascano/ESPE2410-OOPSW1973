const API_URL = "http://localhost:3008/books"; 

document.addEventListener("DOMContentLoaded", fetchBooks);

async function fetchBooks() {
    const tableBody = document.getElementById("bookTable");

    try {
        const response = await fetch(API_URL);
        if (!response.ok) throw new Error("Failed to fetch books");

        const books = await response.json();
        tableBody.innerHTML = ""; 

        books.forEach(book => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.genre}</td>
                <td>${book.yearOfPublication}</td>
            `;
            tableBody.appendChild(row);
        });

    } catch (error) {
        console.error("Error:", error);
    }
}




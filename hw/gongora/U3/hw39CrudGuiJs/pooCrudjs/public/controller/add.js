const API_URL = "http://localhost:3008/books"; 

document.getElementById("addForm").addEventListener("submit", function(event) {
    event.preventDefault(); 
    addBook(event);
});

async function addBook(event) {
    event.preventDefault();

    const id = document.getElementById("id").value;
    const title = document.getElementById("title").value;
    const author = document.getElementById("author").value;
    const genre = document.getElementById("genre").value;
    const year = document.getElementById("year").value;
    const message = document.getElementById("message");

    const book = { id, title, author, genre, yearOfPublication: year };

    try {
        const response = await fetch(API_URL, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(book),
        });

        if (!response.ok) throw new Error("Failed to add book");

        message.textContent = "Book added successfully!";
        message.style.color = "green";
        document.getElementById("addForm").reset();
    } catch (error) {
        message.textContent = "Error: " + error.message;
        message.style.color = "red";
    }
}
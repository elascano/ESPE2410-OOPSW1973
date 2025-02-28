const API_URL = "http://localhost:3008/books"; 

document.getElementById("updateForm").addEventListener("submit", updateBook);

async function updateBook(event) {
    event.preventDefault();

    const id = document.getElementById("updateId").value;
    const title = document.getElementById("updateTitle").value;
    const author = document.getElementById("updateAuthor").value;
    const genre = document.getElementById("updateGenre").value;
    const year = document.getElementById("updateYear").value;
    const message = document.getElementById("updateMessage");

    const updatedBook = { title, author, genre, yearOfPublication: year };

    try {
        const response = await fetch(`${API_URL}/${id}`, {
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(updatedBook),
        });

        if (!response.ok) throw new Error("Failed to update book");

        message.textContent = "Book updated successfully!";
        message.style.color = "green";
        document.getElementById("updateForm").reset();
    } catch (error) {
        message.textContent = "Error: " + error.message;
        message.style.color = "red";
    }

}
const API_URL = "http://localhost:3008/books"; 
document.getElementById("deleteForm").addEventListener("submit", deleteBook);

async function deleteBook(event) {
    event.preventDefault();

    const id = document.getElementById("deleteId").value;
    const message = document.getElementById("deleteMessage");

    try {
        const response = await fetch(`${API_URL}/${id}`, { method: "DELETE" });
        if (!response.ok) throw new Error("Failed to delete book");

        message.textContent = "Book deleted successfully!";
        message.style.color = "green";
        document.getElementById("deleteForm").reset();
    } catch (error) {
        message.textContent = "Error: " + error.message;
        message.style.color = "red";
    }
}
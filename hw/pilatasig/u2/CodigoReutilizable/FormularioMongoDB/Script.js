document.getElementById("form").addEventListener("submit", async (e) => {
    e.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const age = document.getElementById("age").value;

    try {
        const response = await fetch("http://localhost:5000/submit", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({ name, email, age }),
        });

        const data = await response.json();
        document.getElementById("response").textContent = data.message || data.error;
    } catch (error) {
        document.getElementById("response").textContent = "Error al enviar los datos.";
    }
});

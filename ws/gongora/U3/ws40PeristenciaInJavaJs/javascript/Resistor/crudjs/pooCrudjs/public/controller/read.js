const API_URL = "http://localhost:3008/resistors"; 

document.addEventListener("DOMContentLoaded", fetchResistors);
document.getElementById("refresh").addEventListener("click",()=>fetchResistors())

async function fetchResistors() {
    const tableBody = document.getElementById("resistorTable");

    try {
        const response = await fetch(API_URL);
        if (!response.ok) throw new Error("Failed to fetch books");

        const books = await response.json();
        tableBody.innerHTML = ""; 

        books.forEach(resistor => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${resistor.id}</td>
                <td>${resistor.description}</td>
                <td>${resistor.value}</td>
                <td>${resistor.tolerance}</td>
                <td>${resistor.value + resistor.tolerance}</td>
            `;
            tableBody.appendChild(row);
        });

    } catch (error) {
        console.error("Error:", error);
    }
}




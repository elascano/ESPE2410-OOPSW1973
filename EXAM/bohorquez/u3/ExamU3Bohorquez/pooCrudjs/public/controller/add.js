import SortingContext from "./SortingContext.js";
const API_URL = "http://localhost:3002/sortings";

document.getElementById("addForm").addEventListener("submit", function (event) {
    event.preventDefault();
    addSorting(event);
});

const message = document.getElementById("message")
const regex = /^\d+(,\d+)+$/;

async function addSorting(event) {
    event.preventDefault();

    const unsorted = document.getElementById("arrayUnsorted").value;

    if (!regex.test(unsorted)) {
        message.innerHTML = "Enter the valid array, e.g: 1,2,3,4";
        return;
    }

    const arrayUnsortedToCalculate = unsorted.split(",")

    const size = arrayUnsortedToCalculate.length;

    const { arraySorted, sortAlgorithm } = new SortingContext().sort(arrayUnsortedToCalculate)
    const sorted = arraySorted.join(",")

    const sorting = { unsorted, size, sortAlgorithm, sorted };

    displaySorting( unsorted, size, sortAlgorithm, sorted);

    try {
        const response = await fetch(API_URL, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(sorting),
        });

        if (!response.ok) throw new Error("Failed to add sorting");

        message.textContent = "Sorting added successfully!";
        message.style.color = "green";
        document.getElementById("addForm").reset();
    } catch (error) {
        message.textContent = "Error: " + error.message;
        message.style.color = "red";
    }
}


async function displaySorting(unsorted, size, sortAlgorithm, sorted) {
    const tableBody = document.getElementById("sortingTable");
    const row = document.createElement("tr");
    row.innerHTML = `
                <td>${unsorted}</td>
                <td>${size}</td>
                <td>${sortAlgorithm}</td>
                <td>${sorted}</td>
            `;
    tableBody.appendChild(row);

}
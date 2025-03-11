async function sortNumbers() {
    let numbers = document.getElementById("numbers").value.split(",").map(Number);

    const response = await fetch('/api/sort', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ numbers })
    });

    const data = await response.json();
    document.getElementById("result").innerText = "Ordenado: " + data.sortedNumbers.join(", ");
}

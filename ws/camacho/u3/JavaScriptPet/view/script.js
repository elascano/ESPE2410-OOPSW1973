document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("animal-form");
    const animalList = document.getElementById("animal-list");
    const nameInput = document.getElementById("name");
    const typeInput = document.getElementById("type");
    const weightInput = document.getElementById("weight");

    const fetchAnimals = async () => {
        try {
            const response = await fetch("/api/animals");
            const animals = await response.json();
            
            animalList.innerHTML = "";

            animals.forEach(animal => {
                const li = document.createElement("li");
                li.innerHTML = `<strong>${animal.name}</strong> - ${animal.type} - ${animal.weight} kg`;
                animalList.appendChild(li);
            });
        } catch (error) {
            console.error("Error al obtener los animales:", error);
        }
    };

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const animalData = {
            name: nameInput.value,
            type: typeInput.value,
            weight: parseFloat(weightInput.value)
        };

        try {
            const response = await fetch("/api/animals", { 
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(animalData)
            });

            const data = await response.json();
            console.log(data);

            fetchAnimals();

            form.reset();
        } catch (error) {
            console.error("Error al registrar el animal:", error);
        }
    });

    fetchAnimals();
});
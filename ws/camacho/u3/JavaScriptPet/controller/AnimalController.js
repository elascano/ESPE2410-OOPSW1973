import Animal from "../model/Animal.js";

export const registerAnimal = async (req, res) => {
    try {
        const { name, type, weight } = req.body;
        const newAnimal = new Animal({ name, type, weight });
        await newAnimal.save();
        res.status(201).json({ message: "Animal registrado exitosamente" });
    } catch (error) {
        console.error("Error al registrar el animal:", error);
        res.status(500).json({ error: "Error interno del servidor" });
    }
};

export const getAnimals = async (req, res) => {
    try {
        const animals = await Animal.find();
        res.json(animals);
    } catch (error) {
        console.error("Error al obtener los animales:", error);
        res.status(500).json({ error: "Error interno del servidor" });
    }
};

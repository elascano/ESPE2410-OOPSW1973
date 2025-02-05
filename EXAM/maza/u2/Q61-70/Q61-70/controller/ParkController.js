import { getParkById, getAllParks, createPark, updatePark, deletePark } from "../model/ParkModel.js";

// Crear un parque
export async function createParkController(req, res) {
    try {
        const parkData = req.body; // Los datos del parque vienen en el body de la solicitud
        const createdPark = await createPark(parkData);

        if (!createdPark) {
            return res.status(400).json({ error: "Failed to create park" });
        }

        res.status(201).json(createdPark);
    } catch (error) {
        console.error("Error creating park:", error);
        res.status(500).json({ error: "Internal server error" });
    }
}

// Obtener un parque por ID
export async function fetchPark(req, res) {
    try {
        const id = req.params.id; // Capturar el ID de la solicitud
        const park = await getParkById(id);

        if (!park) {
            return res.status(404).json({ error: "Park not found" });
        }

        res.json(park);
    } catch (error) {
        console.error("Error fetching park:", error);
        res.status(500).json({ error: "Internal server error" });
    }
}

// Obtener todos los parques
export async function fetchParks(req, res) {
    try {
        const parks = await getAllParks();

        if (!parks || parks.length === 0) {
            return res.status(404).json({ error: "No parks found" });
        }

        res.json(parks);
    } catch (error) {
        console.error("Error fetching parks:", error);
        res.status(500).json({ error: "Internal server error" });
    }
}

// Actualizar un parque
export async function updateParkController(req, res) {
    try {
        const id = req.params.id;
        const parkData = req.body; // Los datos a actualizar vienen en el body

        const updatedPark = await updatePark(id, parkData);

        if (!updatedPark) {
            return res.status(404).json({ error: "Park not found or update failed" });
        }

        res.json(updatedPark);
    } catch (error) {
        console.error("Error updating park:", error);
        res.status(500).json({ error: "Internal server error" });
    }
}

// Eliminar un parque
export async function deleteParkController(req, res) {
    try {
        const id = req.params.id;

        const isDeleted = await deletePark(id);

        if (!isDeleted) {
            return res.status(404).json({ error: "Park not found or delete failed" });
        }

        res.status(204).send();  // Código 204: Sin contenido
    } catch (error) {
        console.error("Error deleting park:", error);
        res.status(500).json({ error: "Internal server error" });
    }
}

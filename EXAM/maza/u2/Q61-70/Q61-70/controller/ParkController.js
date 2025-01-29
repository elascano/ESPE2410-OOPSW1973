// controller/parkController.js
import { getParkById } from "../model/ParkModel.js";

export async function fetchPark(req, res) {
    try {
        const id = req.params.id; // Capturar el ID del request
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

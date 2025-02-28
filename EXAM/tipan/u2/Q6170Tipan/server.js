const express = require("express");
const cors = require("cors");
const app = express();


app.use(cors());
app.use(express.json()); 


require('./database/database');

const FamilyController = require("./controllers/FamilyController");


app.post("/add-family", async (req, res) => {
  const familyData = req.body;
  try {
    await FamilyController.addFamily(familyData);
    res.status(200).send("Familia añadida correctamente.");
  } catch (error) {
    res.status(500).send("Error al agregar familia.");
  }
});


app.get("/get-families", async (req, res) => {
  try {
    const families = await FamilyController.getFamilies();
    res.status(200).json(families);
  } catch (error) {
    res.status(500).send("Error al obtener las familias.");
  }
});

const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Servidor corriendo en http://localhost:${PORT}`);
});

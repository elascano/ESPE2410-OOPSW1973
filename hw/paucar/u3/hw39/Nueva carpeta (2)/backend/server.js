const express = require("express");
const cors = require("cors");
const connectDB = require("./database");
const productRoutes = require("./routes/productRoutes");

const app = express();


app.use(cors());
app.use(express.json());

connectDB();

app.use("/api", productRoutes);


app.get("/", (req, res) => {
    res.send("API funcionando correctamente");
});


const PORT = 3014;
app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});

const express = require("express");
const cors = require("cors");
const path = require("path");
const conectarDB = require("./DataBase");
const productRoutes = require("./routes/ProductRoutes");

const app = express();


app.use(cors());
app.use(express.json());

app.use("/api/productos", productRoutes);


app.use(express.static(path.join(__dirname, "views")));

app.get("/", (req, res) => {
    res.sendFile(path.join(__dirname, "views", "index.html"));
});

conectarDB().then(() => {
    app.listen(3000, () => {
        console.log("Servidor corriendo en http://localhost:3000");
    });
});

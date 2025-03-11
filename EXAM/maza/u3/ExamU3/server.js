import express from "express";
import sortingRoutes from "./routes/SortingRoutes.js";

const app = express();

app.use(express.json());
app.use(express.static("public"));
app.use("/api", sortingRoutes);

const PORT = 3002;
app.listen(PORT, () => console.log(`Servidor en http://localhost:${PORT}`));

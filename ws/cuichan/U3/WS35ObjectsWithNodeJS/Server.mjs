import express from "express";
const app = express();
const port = 4006;

app.get('/', (req, res) => {
    res.send('Welcome to the server for Hector Cuichan');
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
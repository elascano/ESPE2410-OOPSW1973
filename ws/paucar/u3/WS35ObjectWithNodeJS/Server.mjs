import express from "express";
const app = express();
const port = 4014;

app.get('/', (req, res) => {
    res.send('Welcome to the server of Dennis Paucar!');
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

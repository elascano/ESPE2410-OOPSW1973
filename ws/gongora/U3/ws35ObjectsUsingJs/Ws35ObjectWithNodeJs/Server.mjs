import express from "express";
const app = express();
const port = 4008;
app.get('/', (req , res) => {
    res.send('Welcome to my server Lucas');
} );
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
import express from "express";
const app = express();
const port = 4019;
app.get('/', (req , res) => {
    res.send('Welcome to my server Benjamin R');
} );
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
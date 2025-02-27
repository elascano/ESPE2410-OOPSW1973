import express from "express";
const app = express();
const port = 4018;

app.get('/', (req, res)=> {
    res.send('Welcome to my server! This is Esteban Quiroga');
});
app.listen(port, ()=> {
    console.log(`Server is running on port ${port}`);
});
import express from "express";
const app= express();
const port= 4016;

app.get('/', (req, res)=>{
    res.send('Welcome to David Pilatasig server!');
});

app.listen(port,()=>{
    console.log(`Server is running on port ${port}`);
});
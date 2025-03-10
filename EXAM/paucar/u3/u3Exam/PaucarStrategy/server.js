const port = 3014;
const express = require('express');
const mongoose = require('mongoose');
const app = express();

mongoose.connect('mongodb+srv://dspaucar:dspaucar@cluster0.lx1js.mongodb.net/PaucarStrategy?retryWrites=true&w=majority&appName=Cluster0', {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

const db = mongoose.connection;
db.on('error', (error) => console.error(error));
db.once('open', () => console.log('Connected to MongoDB Database'));

app.use(express.json());
app.use(express.static('view')); 


const sortRoutes = require('./routes/sortRoutes.js');
app.use('/sort', sortRoutes);

app.listen(port, () => {
    console.log("Sorting Application Server is Running on --> http://localhost:3014/ ");
});

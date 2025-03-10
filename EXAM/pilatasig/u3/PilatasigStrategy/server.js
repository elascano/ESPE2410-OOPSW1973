const port = 4016;
const express = require('express');
const mongoose = require('mongoose');
const app = express();

mongoose.connect('mongodb+srv://dapilatasig:dapilatasig@cluster0.1qaby.mongodb.net/PilatasigStrategy?retryWrites=true&w=majority&appName=Cluster0', {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

const db = mongoose.connection;
db.on('error', (error) => console.error(error));
db.once('open', () => console.log('Connected to MongoDB Database'));

app.use(express.json());
app.use(express.static('public'));

const sortRoutes = require('./routes/sortRoutes.js');
app.use('/sort', sortRoutes);

app.listen(port, () => {
    console.log("Sorting Application Server is Running on port --> " + port);
});

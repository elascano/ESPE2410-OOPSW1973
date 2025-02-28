const express = require("express"); // Usar require en lugar de import
const app = express();
const port = 4003;

app.get('/', (req, res) => {
    res.send('Welcome to my server!');
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

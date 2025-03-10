const express = require("express");
const moongose = require("mongoose");
const cors = require("cors")
const bodyParser = require("body-parser")
const { config } = require("dotenv");
const routes = require("./controller/Routes");


config()

const app = express()
const port = process.env.PORT || 3012

app.use(cors())

app.use(bodyParser.json())

moongose.connect("mongodb+srv://jmaza:jmaza@cluster0.y11rj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
db = moongose.connection

app.use("/sortings",routes)

app.listen(port,()=>{
    console.log(`Listening on port ${port}`)
})

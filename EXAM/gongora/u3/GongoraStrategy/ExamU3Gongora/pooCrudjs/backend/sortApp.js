const express = require("express");
const moongose = require("mongoose");
const cors = require("cors")
const bodyParser = require("body-parser")
const { config } = require("dotenv");
const routes = require("./controller/Routes");


config()

const app = express()
const port = process.env.PORT || 3008

app.use(cors())

app.use(bodyParser.json())

moongose.connect(process.env.URL_MONGO,{dbName:process.env.MONGO_DB_NAME})
db = moongose.connection

app.use("/sortings",routes)

app.listen(port,()=>{
    console.log(`Listening on port ${port}`)
})

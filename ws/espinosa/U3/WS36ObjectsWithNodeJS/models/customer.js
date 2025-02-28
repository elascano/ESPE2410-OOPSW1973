const mongoose = require("mongoose");
const customerSchema = new mongoose.Schema(
    {
        id: {type: Number},
        name: { type: String},
        age: { type: Number},
        moneySpent: { type: Number}
    },
    { collection: "Customer" }
);
module.expors = mongoose.model("Customer", customerSchema);
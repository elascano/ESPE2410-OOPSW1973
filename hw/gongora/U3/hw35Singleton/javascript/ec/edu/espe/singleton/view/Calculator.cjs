const USTax = require("../model/USTax.cjs")


function main() {
    const tax = USTax.getInstance();
    const total = tax.salesTotal(100.0, 0.05); 
    console.log(`Total including tax: $${total.toFixed(2)}`);
}


main();
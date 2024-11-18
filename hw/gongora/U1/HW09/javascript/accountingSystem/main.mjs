import { Product } from "./Product.mjs"
import { Inventory } from "./Inventory.mjs"

function main(){
    let chocolate = new Product()
    let inventory = new Inventory()

    console.log("this is a product ->"+chocolate)
    console.log("this is a inventory ->"+inventory)
}

main()
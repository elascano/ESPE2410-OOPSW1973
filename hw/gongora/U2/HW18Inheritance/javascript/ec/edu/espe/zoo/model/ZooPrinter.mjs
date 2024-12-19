import { Mammal } from "../model/Mammal.mjs";
import { Bird } from "../model/Bird.mjs";
import { Reptile } from "../model/Reptile.mjs";
import { Amphibian } from "../model/Amphibian.mjs";
import { Fish } from "../model/Fish.mjs";

export class ZooPrinter {

    static printAnimalDetails(animal, cage) {
        console.log(`----- ${animal.constructor.name} -----`);
        console.log(animal.toString() + "\n");
        console.log("Cage: " + cage.toString());
        console.log();
    }
}



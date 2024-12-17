import fs from "fs";
import { Cable } from "../ec/edu/espe/model/Cable.mjs";

export class FileJSONManager {
    #fileName;
    #cables;

    constructor(fileName) {
        this.#fileName = fileName;
        this.#cables = this.read();
    }

    read() {
        try {
            const data = fs.readFileSync(this.#fileName, 'utf8');
            return JSON.parse(data).map(
                (cable) => new Cable(cable.id, cable.type, cable.numberOfConductors, cable.price)
            );
        } catch (error) {
            return []; 
        }
    }

    create(cable) {
        this.#cables.push(cable);
        this.save();
    }

    save() {
        const data = JSON.stringify(this.#cables.map((cable) => cable.toJSON()), null, 2);
        fs.writeFileSync(this.#fileName, data);
    }

    getAll() {
        return this.#cables;
    }
}

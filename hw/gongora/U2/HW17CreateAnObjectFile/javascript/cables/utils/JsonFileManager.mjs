import { Cable } from "../ec/edu/espe/model/cable.mjs";
import fs from "fs";

export class JsonFileManager{
    #fileName;


    constructor(fileName){
        this.#fileName=fileName;
    }

    create(cable){
        const cables =this.read();

        cables.push(cable)
        this.save(cables)
    }

    delete(idCable){
        const cables = this.read();
        const cablesFiltered = cables.filter( cable => cable.getId() !== idCable);
        this.save(cablesFiltered);
    }

    update(cableModify){
        const cables = this.read();
        const cablesModify=cables.map(cable =>{
            if (cable.getId() === cableModify.getId()){
                return cableModify
            }
            return cable
        })

        this.save(cablesModify)
    }

    save(cables){
        const cablesConverted = JSON.stringify(cables.map(
            cable => cable.toJSON()
        ),null,2);

        fs.writeFileSync(this.#fileName,cablesConverted);
    }

    read(){
        try{
            const cables=fs.readFileSync(this.#fileName,'utf8');
            return JSON.parse(cables).map(cable => new Cable(cable.id,cable.type,cable.numberOfConductors,cable.price));
        }catch(error){
            return [];
        }
    }


}
export class Vaccine {
    constructor(id, description) {
        this._id = id; 
        this._description = description;
    }

    
    get description() {
        return this._description;
    }

    
    set description(newDescription) {
        this._description = newDescription;
    }

    
    get id() {
        return this._id;
    }

    
    set id(newId) {
        this._id = newId;
    }

    toString() {
        return `Vaccine{id=${this._id}, description=${this._description}}`;
    }
}


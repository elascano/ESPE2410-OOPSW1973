const Animal = require('./Animal.js');
class Food {
    constructor(id , amount , type ) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    toString() {
        return `Food { id=${this.id}, amount=${this.amount}, type=${this.type} }`;
    }

  
    get id() {
      return this._id;
    }
  
    set id(value) {
      this._id = value;
    }
  
    get amount() {
      return this._amount;
    }
  
    set amount(value) {
      this._amount = value;
    }
  
    get type() {
      return this._type;
    }
  
    set type(value) {
      this._type = value;
    }
  
  }
  
   module.exports =Food;
const Animal = require('./Animal.js');
    class Mammal extends Animal {
        constructor(maximumHairSize, mammaryGlandsNumber, id, name, bornOnDate, weight, sex, vaccines = []) {

          super(id, name, bornOnDate, weight, sex, vaccines);
          this.maximumHairSize = maximumHairSize;
          this.mammaryGlandsNumber = mammaryGlandsNumber;
        }
      
     
     
  
        toString() {
          return `Mammal { maximumHairSize: ${this._maximumHairSize}, mammaryGlandsNumber: ${this._mammaryGlandsNumber} }`;
        }
        breastFeed() {
            console.log("Breast feeding the children");
          }
      
        get maximumHairSize() {
          return this._maximumHairSize;
        }
        set maximumHairSize(value) {
          this._maximumHairSize = value;
        }
      
        get mammaryGlandsNumber() {
          return this._mammaryGlandsNumber;
        }
        set mammaryGlandsNumber(value) {
          this._mammaryGlandsNumber = value;
        }
      }
      module.exports = Mammal;
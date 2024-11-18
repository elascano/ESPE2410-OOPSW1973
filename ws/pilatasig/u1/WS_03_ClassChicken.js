console.log("Hello User")




class Chicken{
    constructor{
        this.id=0;
        this.name="";
        this.age=0;
        this.color="";
        this.born=new Date();
        this.notBolting=true;
    }
}
const chicken=new Chicken();
console.log("Chicken-->"+chicken.toString());

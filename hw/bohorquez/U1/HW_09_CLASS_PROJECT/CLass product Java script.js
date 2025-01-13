console.log("Hello Users");



//Product

class Product{
    constructor (){
        this.id=0;
        this.name="";
        this.description="";
        this.stock=0;
        this.cost=0;
        this.born=new Date();
        this.notbolting=true;
    }
}
 const product = new Product(); 
 console.log("Product--> " + product.toString());

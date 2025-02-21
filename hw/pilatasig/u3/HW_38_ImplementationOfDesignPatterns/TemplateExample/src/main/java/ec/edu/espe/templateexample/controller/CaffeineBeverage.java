package ec.edu.espe.templateexample.controller;

/**
 *
 * @author David Pilatasig
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourlnCup();
        if(wantsCondiments()){
            addCondiments();
        }
        writefinalmessage();
    }
    private void boilWater(){
        System.out.println("Boiling water");
    }
    
    private void pourlnCup(){
        System.out.println("Pouring into a cup");
    }
    
    private void writefinalmessage(){
            System.out.println("Here is your beverage, thanks you!!!");
    }
    
    public abstract boolean wantsCondiments();
    
    public abstract void brew();
    public abstract void addCondiments();
    
    
}

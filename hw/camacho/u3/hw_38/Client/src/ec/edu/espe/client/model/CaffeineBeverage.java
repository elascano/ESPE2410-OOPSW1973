package ec.edu.espe.client.model;

/**
 *
 * @author mateo
 */
public abstract class CaffeineBeverage {
    
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }
    
    public void boilWater(){
        System.out.println("Boiling Water...");
    }
    
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    public boolean wantsCondiments(){
        return true;
    }
    
    abstract void brew();
    abstract void addCondiments();
}


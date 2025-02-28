package ec.edu.espe.templatemethod.model;

/**
 *
 * @author David Cuichan
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourlInCup();
        
        if(wantsCondiments()){
            addCondiments();
        }
    }
    
    void boilWater(){
        System.out.println("Boiling water");
    }
    
    abstract void brew();
    
    void pourlInCup(){
        System.out.println("Pouring into cup");
    }
    
    abstract void addCondiments();
    
    boolean wantsCondiments(){
        return true;
    }
}

package ec.edu.espe.templateapp.model;

/**
 *
 * @author Dennis Paucar
 */
public abstract class CaffeineBeverage {
    
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }
    
    abstract void brew();
    
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    abstract void addCondiments();

    public boolean wantsCondiments() {
        return true;
    }
}

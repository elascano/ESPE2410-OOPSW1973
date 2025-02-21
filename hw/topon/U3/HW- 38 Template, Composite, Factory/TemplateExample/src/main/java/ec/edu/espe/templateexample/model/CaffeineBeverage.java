package ec.edu.espe.templateexample.model;

/**
 *
 * @author Mateo Topon
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }
    
    protected void boilWater() {
        System.out.println("1: Boiling water");
    }
    
    protected void pourInCup() {
        System.out.println("3: Ouring into cup");
    }

    protected abstract void brew();
    protected abstract boolean wantsCondiments();
    protected abstract void addCondiments();
}

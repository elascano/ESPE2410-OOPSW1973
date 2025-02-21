package ec.edu.espe.templateexample.model;



/**
 *
 * @author Alexander Ullco
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
        System.out.println("Boiling water");
    }
    
    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();
    protected abstract boolean wantsCondiments();
    protected abstract void addCondiments();
}

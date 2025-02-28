package ec.edu.espe.hw27_template.model;

/**
 *
 * @author Sebastian Charij
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

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean wantsCondiments() {
        return true;
    }
}

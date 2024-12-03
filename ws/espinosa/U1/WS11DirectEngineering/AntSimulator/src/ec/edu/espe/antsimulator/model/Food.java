package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Andrés Espinosa
 */
public class Food {
   int ammount;

    public Food(int ammount) {
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "Food{" + "ammount=" + ammount + '}';
    }
   
}

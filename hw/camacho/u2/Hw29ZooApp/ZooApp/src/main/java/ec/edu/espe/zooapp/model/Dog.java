package ec.edu.espe.zooapp.model;

/**
 *
 * @author mateo
 */
public class Dog extends Animal { 
    private String breed;
    private boolean isTrained;

    public Dog(String name, int age, String species, String breed, boolean isTrained) {
        super(name, age, species);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }
}

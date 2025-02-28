package ec.edu.espe.zooapp.model;

/**
 *
 * @author mateo
 */
public class Cat extends Animal {
    private String furColor;
    private boolean isIndoor;

    public Cat(String name, int age, String species, String furColor, boolean isIndoor) {
        super(name, age, species);
        this.furColor = furColor;
        this.isIndoor = isIndoor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }
}


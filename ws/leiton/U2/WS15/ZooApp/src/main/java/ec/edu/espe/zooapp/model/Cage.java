package ec.edu.espe.zooapp.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Leiton
 */
public class Cage {
    private int id;
    private ArrayList<Animal> animals;

    public Cage(int id, ArrayList<Animal> animals) {
        this.id = id;
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Cage{" + "id=" + id + ", animals=" + animals + '}';
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the animals
     */
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /**
     * @param animals the animals to set
     */
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}

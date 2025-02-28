package ec.edu.espe.animalDrawer.view;

import ec.edu.espe.AnimalDrawer.model.Animal;
import ec.edu.espe.AnimalDrawer.model.Bird;
import ec.edu.espe.AnimalDrawer.model.Condor;
import ec.edu.espe.AnimalDrawer.model.Lion;
import ec.edu.espe.AnimalDrawer.model.Mammal;
import ec.edu.espe.AnimalDrawer.model.Tiger;

/**
 *
 * @author Sebastian Charij
 */
public class Sketcher {
    public static void main(String[] args) {
        
        Animal animal = (Animal) new Condor(3.6F);
        animal.born();
        animal.feed();

        animal = new Lion();
        animal.born();
        animal.feed();

        animal = new Tiger();
        animal.born();
        animal.feed();

        Mammal mammal = new Tiger();
        mammal.born();
        mammal.drawTeeth();
        mammal.feed();

        mammal = new Lion();
        mammal.born();
        mammal.drawTeeth();
        mammal.feed();

        Bird bird = new Condor(3.2F);
        bird.born();
        bird.feed();
    }
}


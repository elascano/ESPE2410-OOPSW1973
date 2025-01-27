package ec.edu.espe.animalsdrawing.view;

import ec.edu.espe.animalsdrawing.controller.Animal;
import ec.edu.espe.animalsdrawing.controller.Bird;
import ec.edu.espe.animalsdrawing.controller.Condor;
import ec.edu.espe.animalsdrawing.controller.Lion;
import ec.edu.espe.animalsdrawing.controller.Mammal;
import ec.edu.espe.animalsdrawing.controller.Tiger;

/**
 *
 * @author Andrés Espinosa
 */
public class Sketcher {
    public static void main(String[] args) {
        Animal animal;
        animal = new Condor(3.6F);
        animal.born();
        animal.feed();
        animal = new Lion();
        animal.feed();
        animal.born();
        animal = new Tiger();
        animal.feed();
        
        Mammal mammal;
        mammal = new Tiger();
        mammal.born();
        mammal.feed();
        mammal.drawTeeths();
        mammal = new Lion();
        
        Lion lion = new Lion();
        
        Bird bird;
        bird = new Condor(3.2F);
        bird.born();
        bird.drawPeak();
        bird.drawClaw();
        bird.drawFeather();
        bird.feed();
        
        
    }

}

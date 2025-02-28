package ec.edu.espe.animalsdrawing.view;

import ec.edu.espe.animalsdrawing.controller.Animal;
import ec.edu.espe.animalsdrawing.controller.Bird;
import ec.edu.espe.animalsdrawing.controller.Lion;
import ec.edu.espe.animalsdrawing.controller.Mammal;
import ec.edu.espe.animalsdrawing.controller.Tiger;
import ec.edu.espe.animalsdrawing.model.Condor;

/**
 *
 * @author David Pilatasig
 */
public class Sketcher {
    public static void main(String[] args) {
        Animal animal;
        animal= new Condor(3.6F);
        animal.born();
        animal.feed();
        
        animal= new Lion();
        animal.born();
        animal.feed();
        
        Mammal mammal= new Tiger();
        mammal.born();
        mammal.feed();
        mammal.drawTheet();
        
        Bird bird= new Condor(3.6F);
        bird.born();
        bird.drawBeak();
        bird.drawClaws();
        bird.drawFeathers();
        bird.feed();
    }
}

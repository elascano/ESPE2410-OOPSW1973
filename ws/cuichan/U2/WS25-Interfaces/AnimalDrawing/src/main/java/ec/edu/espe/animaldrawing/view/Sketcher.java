package ec.edu.espe.animaldrawing.view;

import ec.edu.espe.animaldrawing.controller.Animal;
import ec.edu.espe.animaldrawing.controller.Bird;
import ec.edu.espe.animaldrawing.controller.Condor;
import ec.edu.espe.animaldrawing.controller.Lion;
import ec.edu.espe.animaldrawing.controller.Mammal;
import ec.edu.espe.animaldrawing.controller.Tiger;

/**
 *
 * @author David Cuichan
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
        animal.born();
        
        Mammal mammal;
        mammal = new Tiger();
        mammal.born();
        mammal.drawTeeth();
        mammal.feed();
        
        Bird bird;
        bird = new Condor(3.5F);
        bird.born();
        bird.drawBeak();
        bird.drawClaws();
        bird.drawFeathers();
    }
}


package ec.edu.espe.interfaces.view;

import ec.edu.espe.interfaces.controller.Animal;
import ec.edu.espe.interfaces.controller.Bird;
import ec.edu.espe.interfaces.controller.Condor;
import ec.edu.espe.interfaces.controller.Lion;
import ec.edu.espe.interfaces.controller.Mammal;
import ec.edu.espe.interfaces.controller.Tiger;

/**
 *
 * @author marlo
 */
public class Sketcher {
    public static void main(String[] args) {
    Animal animal;
    animal = new Condor(3.6F);
    animal.born();
    animal.feed();
    animal = new Lion();
    animal.born();
    animal.feed();
    animal = new Tiger();
    animal.born();
    
    Mammal mammal;
    mammal = new Tiger();
    mammal.born();
    mammal.drawTheeth();
    mammal.feed();
    mammal = new Lion();
    
    Bird bird;
    bird = new Condor(6.3F);
    bird.born();
    bird.drawBeak();
    bird.drawClaws();
    bird.drawFeathers();
    bird.feed();
            
    }
}

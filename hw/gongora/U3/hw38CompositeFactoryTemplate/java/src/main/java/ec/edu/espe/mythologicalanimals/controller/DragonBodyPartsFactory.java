package ec.edu.espe.mythologicalanimals.controller;

import ec.edu.espe.mythologicalanimals.model.DragonHead;
import ec.edu.espe.mythologicalanimals.model.DragonLeg;
import ec.edu.espe.mythologicalanimals.model.DragonTail;
import ec.edu.espe.mythologicalanimals.model.DragonWing;



/**
 *
 * @author Lucas Gongora
 */
public class DragonBodyPartsFactory implements AnimalBodyPartsFactory {

    @Override
    public Head createHead() {
        return new DragonHead();
    }

    @Override
    public Leg createLeg() {
        return new DragonLeg();
    }

    @Override
    public Tail createTail() {
        return new DragonTail();
    }

    @Override
    public Wing createWing() {
        return new DragonWing();
    }
    
    

}

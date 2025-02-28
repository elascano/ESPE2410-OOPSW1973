

package ec.edu.espe.mythologicalanimals.controller;

import ec.edu.espe.mythologicalanimals.model.GriffinHead;
import ec.edu.espe.mythologicalanimals.model.GriffinLeg;
import ec.edu.espe.mythologicalanimals.model.GriffinTail;
import ec.edu.espe.mythologicalanimals.model.GriffinWing;

/**
 *
 * @author Lucas Gongora
 */
public class GriffinBodyPartsFactory  implements AnimalBodyPartsFactory{

    @Override
    public Head createHead() {
        return new GriffinHead();
    }

    @Override
    public Leg createLeg() {
        return new GriffinLeg();
    }

    @Override
    public Tail createTail() {
        return new GriffinTail();
    }

    @Override
    public Wing createWing() {
        return new GriffinWing();
    }

}

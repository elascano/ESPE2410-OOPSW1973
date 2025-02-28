/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espe.mythologicalanimals.view;

import ec.edu.espe.mythologicalanimals.controller.GriffinBodyPartsFactory;
import ec.edu.espe.mythologicalanimals.controller.DragonBodyPartsFactory;
import ec.edu.espe.mythologicalanimals.controller.Head;
import ec.edu.espe.mythologicalanimals.controller.Leg;
import ec.edu.espe.mythologicalanimals.controller.Tail;
import ec.edu.espe.mythologicalanimals.model.Griffin;
import ec.edu.espe.mythologicalanimals.model.Dragon;

/**
 *
 * @author Lucas Gongora
 */
public class MythologicalAnimals {

    public static void main(String[] args) {
        GriffinBodyPartsFactory griffinBodyPartsFactory = new GriffinBodyPartsFactory();

        Head head1 = griffinBodyPartsFactory.createHead();

        Leg leg1 = griffinBodyPartsFactory.createLeg();
        Leg leg2 = griffinBodyPartsFactory.createLeg();
        Leg leg3 = griffinBodyPartsFactory.createLeg();
        Leg leg4 = griffinBodyPartsFactory.createLeg();

        Tail tail = griffinBodyPartsFactory.createTail();

        Griffin griffin = new Griffin();

        griffin.add(head1);
        griffin.add(leg1);
        griffin.add(leg2);
        griffin.add(leg3);
        griffin.add(leg4);
        griffin.add(tail);

        griffin.appear();
        griffin.attack();

        DragonBodyPartsFactory dragonBodyPartsFactory = new DragonBodyPartsFactory();

        head1 = dragonBodyPartsFactory.createHead();
        
        leg1 = dragonBodyPartsFactory.createLeg();
        leg2 = dragonBodyPartsFactory.createLeg();
        leg3 = dragonBodyPartsFactory.createLeg();
        leg4 = dragonBodyPartsFactory.createLeg();
        
        tail = dragonBodyPartsFactory.createTail();
        
        Dragon dragon = new Dragon();
        
        dragon.add(head1);
        dragon.add(leg1);
        dragon.add(leg2);
        dragon.add(leg3);
        dragon.add(leg4);
        dragon.add(tail);
        
        dragon.appear();
        dragon.attack();
        
        

    }
}

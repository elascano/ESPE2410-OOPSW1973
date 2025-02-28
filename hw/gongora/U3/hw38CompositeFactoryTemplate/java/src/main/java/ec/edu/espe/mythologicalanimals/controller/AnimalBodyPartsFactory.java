

package ec.edu.espe.mythologicalanimals.controller;

/**
 *
 * @author Lucas Gongora
 */
public  interface AnimalBodyPartsFactory {
   
    public Head createHead();
    public Leg createLeg();
    public Tail createTail();
    public Wing createWing();
}

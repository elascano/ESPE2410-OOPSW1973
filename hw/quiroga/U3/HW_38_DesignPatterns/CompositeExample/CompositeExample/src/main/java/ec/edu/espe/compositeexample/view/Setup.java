
package ec.edu.espe.compositeexample.view;

import ec.edu.espe.compositeexample.model.Clerk;
import ec.edu.espe.compositeexample.model.Client;
import ec.edu.espe.compositeexample.model.Manager;
import ec.edu.espe.compositeexample.model.President;
import ec.edu.espe.compositeexample.model.Teller;

/**
 *
 * @author Esteban Quiroga 
 */
public class Setup {

    public static void main(String[] args) {
        //Make Manager Able's organization
        Teller lonny = new Teller("Lonny");
        Clerk cal = new Clerk("Cal");
        Manager able = new Manager("Able");
        able.add(lonny);
        able.add(cal);
        
        //Make manager Becky's organization
        Teller juanita = new Teller("Juanita");
        Teller tina = new Teller("Tina");
        Teller thelma = new Teller("Thelma");
        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);
        
        //Create the president's direct reports
        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);
        
        //Initiate client
        Client.employee = pete;
        Client.doClientTasks();
    }
}

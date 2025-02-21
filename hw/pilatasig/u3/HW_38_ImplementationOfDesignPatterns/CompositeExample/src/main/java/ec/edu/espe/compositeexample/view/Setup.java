
package ec.edu.espe.compositeexample.view;

import ec.edu.espe.compositeexample.model.Clerk;
import ec.edu.espe.compositeexample.model.Client;
import ec.edu.espe.compositeexample.model.Manager;
import ec.edu.espe.compositeexample.model.President;
import ec.edu.espe.compositeexample.model.Teller;

/**
 *
 * @author David Pilatasig
 */
public class Setup {
    public static void main(String[] args) {
       Teller lonny = new Teller("Lonny");
       Clerk cal = new Clerk("Cal");
       Manager able = new Manager("Able");
       able.add(lonny);
       able.add(cal);

       Teller juanita = new Teller("Juanita");
       Teller tina = new Teller("Tina");
       Teller thelma = new Teller("Thelma");
       Manager becky = new Manager("Becky");
       becky.add(juanita);
       becky.add(tina);
       becky.add(thelma);
       
        President president = President.getPresident("Pete");
        president.add(able);
        president.add(becky);
        
        Client.employee = president;
        Client.doClientTasks();
    }
    
}

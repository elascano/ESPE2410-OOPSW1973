package ec.edu.espe.hw38compositepattern.view;

import ec.edu.espe.hw38compositepattern.model.Clerk;
import ec.edu.espe.hw38compositepattern.model.Client;
import ec.edu.espe.hw38compositepattern.controller.Manager;
import ec.edu.espe.hw38compositepattern.model.President;
import ec.edu.espe.hw38compositepattern.model.Teller;

/**
 *
 * @author Brandon Pazmino
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

        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);

        Client.employee = pete;
        Client.doClientTasks();
    }
}

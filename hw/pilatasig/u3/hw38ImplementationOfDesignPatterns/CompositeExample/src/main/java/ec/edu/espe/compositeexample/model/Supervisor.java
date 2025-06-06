
package ec.edu.espe.compositeexample.model;

import java.util.Vector;

/**
 *
 * @author David Pilatasig
 */
abstract public class Supervisor extends Employee{
    protected Vector directReports = new Vector();
    
    public void stateName(){
        super.stateName();
        if(directReports.size()>0)
            for(int i=0;i<directReports.size();i++)
                ((Employee)directReports.elementAt(i)).stateName();
    }
    
    public void add(Employee anEmployee){
        this.directReports.addElement(anEmployee);
    }
}

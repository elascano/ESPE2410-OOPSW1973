
package ec.edu.espe.compositeapp.model;

import java.util.Vector;

/**
 *
 * @author Dennis Paucar
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

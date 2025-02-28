package ec.edu.espe.compositePattern.model;

/**
 *
 * @author Camila Bohorquez
 */
public abstract class BaseEmployee implements Employee {   
protected String name;
    protected String title;

    public BaseEmployee(String name, String title) {
        this.name = name;
        this.title = title;
    }

   public void stateName(StringBuilder sb) {
        sb.append(title).append(" ").append(name).append("\n");
    }
}

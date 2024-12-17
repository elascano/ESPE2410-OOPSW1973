
package chickenclassimplementation;

import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private Date bornOnDate;
    private boolean notMolting;

    public Chicken(int id, String name, String color, int age, Date bonrOnDate, boolean notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.bornOnDate = bonrOnDate;
        this.notMolting = notMolting;
    }

    @Override
    public String toString() {
        return "Chicken{" + 
                "\nid=" + id + 
                ", \nname=" + name + 
                ", \ncolor=" + color + 
                ", \nage=" + age + 
                ", \nbornOnDate=" + bornOnDate + 
                ", \nnotMolting=" + notMolting + '}';
    }
    
    

    public boolean isNotMolting() {
        return notMolting;
    }

    public void setNotMolting(boolean notMolting) {
        this.notMolting = notMolting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
    
    
}

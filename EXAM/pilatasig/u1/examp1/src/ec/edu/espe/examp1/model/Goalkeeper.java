
package ec.edu.espe.examp1.model;

/**
 *
 * @author David Pilatasig
 */
public class Goalkeeper {
   private String name;
   private String team;
   private String idCard;
   private int age;

    public Goalkeeper(String name, String team, String idCard, int age) {
        this.name = name;
        this.team = team;
        this.idCard = idCard;
        this.age = age;
    }

    public Goalkeeper() {
    }

    @Override
    public String toString() {
        return "Person{\n" + "\nname=" + name + ", \nteam=" + team + ", \nidCard=" + idCard + ", \nage=" + age + '}';
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getAge() {
        return age ;
    }

    public void setPhoneNumber(int age) {
        this.age = age;
    }
}

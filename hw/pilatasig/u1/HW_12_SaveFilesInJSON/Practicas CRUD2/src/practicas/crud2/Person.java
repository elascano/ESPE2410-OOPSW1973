
package practicas.crud2;

/**
 *
 * @author David Pilatasig
 */
public class Person {
   private String name;
   private String direction;
   private String idCard;
   private String phoneNumber;

    public Person(String name, String direction, String idCard, String phoneNumber) {
        this.name = name;
        this.direction = direction;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{\n" + "\nname=" + name + ", \ndirection=" + direction + ", \nidCard=" + idCard + ", \nphoneNumber=" + phoneNumber + '}';
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

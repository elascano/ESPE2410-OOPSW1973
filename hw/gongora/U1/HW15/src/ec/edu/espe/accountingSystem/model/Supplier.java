package ec.edu.espe.accountingSystem.model;

/**
 *
 * @author Lucas Gongora
 */
public class Supplier extends Entity {

    private String type;

    public Supplier(String id, String name, IdentityCard identityCard, String address, String phoneNumber, String email) {
        super(id, name, identityCard, address, phoneNumber, email);
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
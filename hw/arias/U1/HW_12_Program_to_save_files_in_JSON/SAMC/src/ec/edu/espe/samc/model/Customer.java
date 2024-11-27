package ec.edu.espe.samc.model;

/**
 *
 * @author Alan
 */
public class Customer {
    private String name;
    private int id;
    private String email;
    private String address;
    private String phoneNumber;

    public Customer(String name, int id, String email, String address, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "ID=" + id +
               ", Nombre='" + name + '\'' +
               ", Email='" + email + '\'' +
               ", Direccion='" + address + '\'' +
               ", Telefono='" + phoneNumber + '\'' +
               '}';
    }
}

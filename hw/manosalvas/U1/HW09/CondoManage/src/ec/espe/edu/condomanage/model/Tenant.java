package ec.espe.edu.condomanage.model;

public class Tenant {
    private int id;
    private String name;
    private int houseNumber;
    private int phone;
    private boolean paymentStatus;

    // Constructor vacío
    public Tenant() {
    }

    // Constructor con parámetros
    public Tenant(int id, String name, int houseNumber, int phone, boolean paymentStatus) {
        this.id = id;
        this.name = name;
        this.houseNumber = houseNumber;
        this.phone = phone;
        this.paymentStatus = paymentStatus;
    }

    // Métodos getter y setter
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

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", phone=" + phone +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}

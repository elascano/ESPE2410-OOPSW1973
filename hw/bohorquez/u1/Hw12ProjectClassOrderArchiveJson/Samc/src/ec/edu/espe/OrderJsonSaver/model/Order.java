/**
 *
 * @author Camila Bohorquez
 */
package ec.edu.espe.OrderJsonSaver.model;

import java.io.FileWriter;
import java.io.IOException;

public class Order {
    private int orderId;
    private String customerName;
    private String dishName;
    private String paymentType;
    private int serviceRating;

    // Constructor
    public Order(int orderId, String customerName, String dishName, String paymentType, int serviceRating) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.dishName = dishName;
        this.paymentType = paymentType;
        this.serviceRating = serviceRating;
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(int serviceRating) {
        this.serviceRating = serviceRating;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"orderId\": " + orderId + ",\n" +
                "  \"customerName\": \"" + customerName + "\",\n" +
                "  \"dishName\": \"" + dishName + "\",\n" +
                "  \"paymentType\": \"" + paymentType + "\",\n" +
                "  \"serviceRating\": " + serviceRating + "\n" +
                "}";
    }

    
    public void saveToJsonFile(String fileName) {
        String jsonContent = this.toString();
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(jsonContent);
            System.out.println("Order saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
        }
    }
}

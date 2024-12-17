
package ec.edu.espe.cathedral.model;
 
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marlon Pasquel
 */
public class Cathedral {
   private int cathedralId;
   private String cathedralName;
   private String locationCity;
   private int yearOfConstruction;

    public Cathedral(int cathedralId, String cathedralName, String locationCity, int yearOfConstruction) {
        this.cathedralId = cathedralId;
        this.cathedralName = cathedralName;
        this.locationCity = locationCity;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        return "Cathedral{" + "cathedralId=" + cathedralId + ", cathedralName=" + cathedralName + ", locationCity=" + locationCity + ", yearOfConstruction=" + yearOfConstruction + '}';
    }

   
    /**
     * @return the cathedralId
     */
    public int getCathedralId() {
        return cathedralId;
    }

    /**
     * @param cathedralId the cathedralId to set
     */
    public void setCathedralId(int cathedralId) {
        this.cathedralId = cathedralId;
    }

    /**
     * @return the cathedralName
     */
    public String getCathedralName() {
        return cathedralName;
    }

    /**
     * @param cathedralName the cathedralName to set
     */
    public void setCathedralName(String cathedralName) {
        this.cathedralName = cathedralName;
    }

    /**
     * @return the locationCity
     */
    public String getLocationCity() {
        return locationCity;
    }

    /**
     * @param locationCity the locationCity to set
     */
    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    /**
     * @return the yearOfConstruction
     */
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    /**
     * @param yearOfConstruction the yearOfConstruction to set
     */
    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }
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
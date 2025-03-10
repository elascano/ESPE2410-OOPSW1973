package ec.edu.espe.basicopetration.model;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author David Cuichan
 */
public class Color {

    private ObjectId id;
    private String colorId;
    private String colorName;
    private String type;
    private double price;

    public Color(String colorId, String colorName, String type, double price) {
        this.colorId = colorId;
        this.colorName = colorName;
        this.type = type;
        this.price = price;
    }

    public Color(Document doc) {
        this.id = doc.getObjectId("_id");
        this.colorName = doc.getString("colorName");
        this.colorId = doc.getString("colorId");
        this.type = doc.getString("type");
        this.price = doc.getDouble("price");
    }

    public Document toDocument() {
        Document doc = new Document();
        doc.append("colorName", this.getColorName());
        doc.append("colorId", this.getColorId());
        doc.append("type", this.getType());
        doc.append("price", this.getPrice());
        return doc;
    }

    /**
     * @return the id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * @return the colorId
     */
    public String getColorId() {
        return colorId;
    }

    /**
     * @param colorId the colorId to set
     */
    public void setIdColor(String colorId) {
        this.colorId = colorId;
    }

    /**
     * @return the colorName
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * @param colorName the colorName to set
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
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

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

}



package utils;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
import ec.edu.espe.objectsdatapersistance.model.SdCard;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SdCardManager {
    private static final String dataFile = "sdCardData.ser";
    private List<SdCard> sdCards;

    public SdCardManager() {
        this.sdCards = loadData();
    }

    public List<SdCard> getAllSdCards() {
        return sdCards;
    }

   public void addSdCard(SdCard sdCard) throws Exception {
    if (findSdCardById(sdCard.getId()) != null) {
        throw new Exception("An SD Card with this ID already exists.");
    }
    sdCards.add(sdCard);
    saveData();
    System.out.println("SD Card added successfully.");
    }

    public void updateSdCard(int id, String newBrand, int newStorage, double newPrice) throws Exception {
        SdCard sdCard = findSdCardById(id);
        if (sdCard == null) {
        throw new Exception("SD Card with ID " + id + " not found.");
        }
        sdCard.setBrand(newBrand);
        sdCard.setStorage(newStorage);
        sdCard.setPrice(newPrice);
        saveData();
        System.out.println("SD Card updated successfully.");
        }   

    public void deleteSdCard(int id) throws Exception {
        SdCard sdCard = findSdCardById(id);
        if (sdCard == null) {
        throw new Exception("SD Card with ID " + id + " not found.");
        }
         sdCards.remove(sdCard);
        saveData();
        System.out.println("SD Card deleted successfully.");
        }


    private SdCard findSdCardById(int id) {
        for (SdCard sdCard : sdCards) {
            if (sdCard.getId() == id) {
                return sdCard;
            }
        }
        return null;
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            oos.writeObject(sdCards);
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private List<SdCard> loadData() {
        File file = new File(dataFile);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<SdCard>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}


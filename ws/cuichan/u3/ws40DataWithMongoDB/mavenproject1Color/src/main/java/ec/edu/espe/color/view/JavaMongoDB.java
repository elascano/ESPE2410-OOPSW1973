package ec.edu.espe.color.view;

import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author David Cuichan
 */
public class JavaMongoDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String uri = "mongodb+srv://HectorD:hTCvkRkfhXROZMYN@clusterdb.to0oy.mongodb.net/?retryWrites=true&w=majority&appName=ClusterDB";
        
        try(MongoClient mongoClient = MongoClients.create(uri)){
            while (true) {                
                System.out.println("========= MENU =========\n");
                System.out.println("1. View existing databases\n");
                System.out.println("2. Create new database and collection\n");
                System.out.println("3. Add new collection to an existing database\n");
                System.out.println("4. Insert data into a collection\n");
                System.out.println("5. Exit\n");
                System.out.print("Select a number option: ");
                option = scanner.nextInt();
                scanner.nextLine();
                
                switch (option) {
                    case 1:
                        showDataBase(mongoClient);
                        break;
                    case 2:
                        createNewDataBase(mongoClient, scanner);
                        break;
                    case 3:
                        addCollection(mongoClient, scanner);
                        break;
                    case 4:
                        insertData(mongoClient, scanner);
                        break;
                    case 5:
                        System.out.println("Good Bye!!");
                        return;
                    default:
                        System.out.println("Invalid option, try again");
                }
            }
        }catch(Exception e){
            System.err.println("Error in the conection: " + e.getMessage());
        }
        
    }

    private static void showDataBase(MongoClient mongoClient) {
        System.out.println("Existing databases\n");
        ListDatabasesIterable<Document> databases = mongoClient.listDatabases();
        for(Document db : databases){
            System.out.println("- " + db.get("name"));
        }
    }

    private static void createNewDataBase(MongoClient mongoClient, Scanner scanner) {
        String DBName;
        String collectionName;
        try{
            System.out.println("Create a new DataBase");
            System.out.print("Name: ");
            DBName = scanner.nextLine();
            
            System.out.print("Name of the collection: ");
            collectionName = scanner.nextLine();
            
            MongoDatabase database = mongoClient.getDatabase(DBName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            
            Document initialDoc = new Document("_id", "init").append("Description", "Initial Document of the collection");
            collection.insertOne(initialDoc);
            
            System.out.println("Database '" + DBName + "' and Collection '" + collectionName + "' successfully created!");
            
            collection.deleteOne(new Document("_id", "init"));
            
        }catch(Exception e){
            System.out.println("Error creating Database: " + e.getMessage());
        }
    }


    private static void addCollection(MongoClient mongoClient, Scanner scanner) {
        String DBName;
        String collectionName;
        
        try{
            System.out.println("Available databases");
            showDataBase(mongoClient);
            
            System.out.print("Name of the database where to create the collection: ");
            DBName = scanner.nextLine();
            
            System.out.print("Name of the Collection: ");
            collectionName = scanner.nextLine();
            
            MongoDatabase database = mongoClient.getDatabase(DBName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            
            Document initialDoc = new Document("_id", "init").append("Description", "Initial Document of the collection");
            collection.insertOne(initialDoc);
            collection.deleteOne(new Document("_id", "init"));
            
            System.out.println("Collection '" + collectionName + "' successfully created in the database '" + DBName + "'!");
            
        }catch(Exception e){
            System.out.println("Error creating collection" + e.getMessage());
        }
    }
    
    private static void insertData(MongoClient mongoClient, Scanner scanner) {
        String DBName;
        String collectionName;
        int numDataType;
        String dataTypeName;
        String dataTypeValue;
        
        try {
            System.out.println("Available databases");
            showDataBase(mongoClient);

            System.out.print("Insert Database Name:");
            DBName = scanner.nextLine();
            
            System.out.print("Insert Collection Name:");
            collectionName = scanner.nextLine();
            
            MongoDatabase database = mongoClient.getDatabase(DBName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            
            System.out.println("Enter the number of Datatypes to insert:");
            numDataType = scanner.nextInt();
            scanner.nextLine();
            
            Document document = new Document();
            for(int i = 0; i < numDataType; i++){
                System.out.printf("Enter the data type name %d: ", i + 1);
                dataTypeName = scanner.nextLine();
                
                System.out.printf("Enter the data type value %s: ", dataTypeName);
                dataTypeValue = scanner.nextLine();
                
                document.append(dataTypeName, dataTypeValue);
            }
            
            collection.insertOne(document);
            System.out.println("Data successfully inserted into collection");
        } catch (Exception e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
        
    }

}

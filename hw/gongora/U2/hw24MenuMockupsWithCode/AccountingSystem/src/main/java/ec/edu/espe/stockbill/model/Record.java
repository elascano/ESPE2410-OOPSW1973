package ec.edu.espe.stockbill.model;

import ec.edu.espe.stockbill.exception.VariablesNotFoundInPathException;
import utils.MongoDbManager;

public abstract class Record {

    private MongoDbManager database;

    public Record() {
        try {
            
            this.database = new MongoDbManager("StockBill");

        } catch (VariablesNotFoundInPathException ex) {
           
            System.err.println("Error con las variables de entorno: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Error inesperado al conectar con la base de datos: " + ex.getMessage());
        }
    }

    /**
     * @return la instancia de la base de datos.
     */
    public MongoDbManager getDatabase() {
        if (this.database == null) {
            System.err.println("No hay conexión a la base de datos.");
        }
        return database;
    }
    
    
}

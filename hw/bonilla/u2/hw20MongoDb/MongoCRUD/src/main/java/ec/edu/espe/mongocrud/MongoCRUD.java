
package ec.edu.espe.mongocrud;

/**
 *
 * @author Robinson Bonilla <jabasteam>
 */
public class MongoCRUD {

    public static void main(String[] args) {
        // URI de conexión a MongoDB y nombre de la base de datos
        String uri = "mongodb://localhost:27017"; // Cambia si es necesario
        String dbName = "testDatabase"; // Nombre de la base de datos

        // Crear la conexión a MongoDB
        MongoDBConnection connection = new MongoDBConnection(uri, dbName);
        CRUDOperations crudOps = new CRUDOperations(connection.getDatabase());

        // Crear un documento
        crudOps.create("testCollection", "name", "John Doe");

        // Leer el documento
        crudOps.read("testCollection", "name");

        // Actualizar el documento
        crudOps.update("testCollection", "name", "Jane Doe");

        // Leer el documento después de la actualización
        crudOps.read("testCollection", "name");

        // Eliminar el documento
        crudOps.delete("testCollection", "name");

        // Cerrar la conexión
        connection.close();
    }
}


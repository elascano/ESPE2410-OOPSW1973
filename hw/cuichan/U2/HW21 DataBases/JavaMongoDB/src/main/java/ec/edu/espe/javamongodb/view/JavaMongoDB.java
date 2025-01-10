package ec.edu.espe.javamongodb.view;

/**
 *
 * @author David Cuichan
 */
public class JavaMongoDB {
    public static void main(String[] args) {
        MongoDBConexion conexion = new MongoDBConexion();
        
        try {
            
            conexion.conectar();
          
            Persona persona1 = new Persona("Juan", 25, "Madrid");
            conexion.guardarPersona(persona1);
            
            System.out.println("Datos guardados exitosamente");
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            conexion.cerrarConexion();
        }
    }
}

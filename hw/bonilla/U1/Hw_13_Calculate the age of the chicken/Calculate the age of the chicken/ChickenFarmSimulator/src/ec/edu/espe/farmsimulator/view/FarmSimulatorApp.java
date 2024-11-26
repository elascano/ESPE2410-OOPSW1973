
package ec.edu.espe.farmsimulator.view;
//---------------------------------------------
//Libreria json

//---------------------------------------------
import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.program.EdadCalculator;
import java.util.Scanner;
//--------------------------------------------------------------
import java.time.LocalDate;

//--------------------------------------------------------------

/**
 *
 * @author Robinson Bonilla
 */
public class FarmSimulatorApp {
       public static void main(String[]args){
           
           //Ingresar datos por el usuario
           
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese id de la gallina :");
        int id=scanner.nextInt();
      
        scanner.nextLine();  // Esta línea es importante limpia el salto de línea residual después de nextInt();
        System.out.println("Ingrese el nombre de la gallina ");
        String name=scanner.nextLine();
        System.out.println("Ingrese el color de la gallina");
        String color=scanner.nextLine();
        
        
        //-------------------------------------------------------------------
        
         // Crear un objeto Scanner para leer la entrada del usuario
       
        
        // Pedir al usuario que ingrese su fecha de nacimiento
        System.out.println("Por favor, ingresa tu fecha de nacimiento (formato: YYYY-MM-DD): ");
        String fechaNacimientoString = scanner.nextLine();
        
        // Convertir la fecha de nacimiento en un objeto LocalDate
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);
        
        // Crear una instancia de EdadCalculator
        EdadCalculator calculadora = new EdadCalculator();
        
        // Calcular la edad usando el método de EdadCalculator
        int edad = calculadora.calcularEdad(fechaNacimiento);
       
        // Cerrar el scanner
        scanner.close();
        //------------------------------------------------------------------
        
        //System.out.println("Ingrese la fecha de nacimiento de la gallina");
        //bornOnDate=scanner.
        Chicken pollo=new Chicken(id,name,color);
        
        //Imprimir los datos
        System.out.println("El id de la gallina es:-------->"+ id);
        System.out.println("El nombre de la gallina es------> "+ name);
         System.out.println("El color de la gallina es ------>"+ color);
         System.out.println("La edad de la gallina es: ------>" + edad );
         
         
    //--------------------------------------------------------------------------
                                      //json
                                      
       }
       
       
}

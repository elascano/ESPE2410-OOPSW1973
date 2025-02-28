
package modularidad;

public class Modularidad {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        
        persona1.informacion();
        
        persona1.setNombre("Carlos");
        persona1.setEdad(30);
        
        System.out.println("");
        
        System.out.println("Informacion actualizada del usuario:");
        persona1.informacion();
    }
}
   

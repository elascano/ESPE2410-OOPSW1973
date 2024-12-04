
package com.ejemplo.estudiantes.view;
import com.ejemplo.estudiantes.model.Estudiante;
import java.util.List;
/**
 *
 * @author Robinson Bonilla
 */
public class EstudianteView {
    public void listarEstudiantes(List<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
      public void mostrarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            System.out.println("Estudiante no encontrado.");
        } else {
            System.out.println(estudiante);
        }
    }
}
    


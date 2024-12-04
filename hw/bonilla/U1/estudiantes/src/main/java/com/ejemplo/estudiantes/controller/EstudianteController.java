
package com.ejemplo.estudiantes.controller;

import com.ejemplo.estudiantes.model.Estudiante;
import com.ejemplo.estudiantes.utils.JsonUtils;
import com.ejemplo.estudiantes.view.EstudianteView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robinson Bonilla
 */
public class EstudianteController {

    private List<Estudiante> estudiantes;
    private EstudianteView view;
    private static final String FILE_NAME = "estudiantes.json";
    private int currentId = 1; // ID inicial

    public EstudianteController(EstudianteView view) {
        this.view = view;
        this.estudiantes = new ArrayList<>(JsonUtils.cargarDesdeJson(FILE_NAME, Estudiante[].class));
        
        // Si hay estudiantes, actualiza currentId al mayor ID encontrado
        if (!estudiantes.isEmpty()) {
            currentId = estudiantes.stream()
                                   .mapToInt(Estudiante::getId)
                                   .max()
                                   .orElse(0) + 1;
        }
    }

    /*
     * CRUD
     */

    // Create
    public void agregarEstudiante(Estudiante estudiante) {
        estudiante.setId(currentId++); // Asigna un ID único y lo incrementa
        estudiantes.add(estudiante);
        JsonUtils.guardarEnJson(FILE_NAME, estudiantes);
        view.mostrarMensaje("Estudiante agregado exitosamente con ID: " + estudiante.getId());
    }

    // Read
    public void listarEstudiantes() {
        view.listarEstudiantes(estudiantes);
    }

    // Read by estudiante id
    public void buscarEstudiante(int id) {
        Estudiante estudianteEncontrado = null;

        // Buscar el estudiante por ID
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        if (estudianteEncontrado != null) {
            view.mostrarEstudiante(estudianteEncontrado);
        } else {
            view.mostrarMensaje("Estudiante no encontrado.");
        }
    }

    // Update
    public void modificarEstudiante(int id, String nombre, String correo, int edad) {
        Estudiante estudianteEncontrado = null;

        // Buscar el estudiante por ID
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        if (estudianteEncontrado != null) {
            estudianteEncontrado.setNombre(nombre);
            estudianteEncontrado.setCorreo(correo);
            estudianteEncontrado.setEdad(edad);

            JsonUtils.guardarEnJson(FILE_NAME, estudiantes);
            view.mostrarMensaje("Estudiante modificado exitosamente.");
        } else {
            view.mostrarMensaje("Estudiante no encontrado. No se puede modificar.");
        }
    }

    // Delete
    public void eliminarEstudiante(int id) {
        Estudiante estudianteEncontrado = null;

        // Buscar el estudiante por ID
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        if (estudianteEncontrado != null) {
            estudiantes.remove(estudianteEncontrado);
            JsonUtils.guardarEnJson(FILE_NAME, estudiantes);
            view.mostrarMensaje("Estudiante eliminado exitosamente.");
        } else {
            view.mostrarMensaje("Estudiante no encontrado. No se puede eliminar.");
        }
    }
}
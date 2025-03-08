package ec.edu.espe.juicebar.controller;

import javax.swing.JOptionPane;
import ec.edu.espe.juicebar.view.FrmAddTypeJuice; // Vista
import ec.edu.espe.juicebar.model.Juice; // Modelo
import ec.edu.espe.juicebar.dao.JuiceDAO; // DAO para la base de datos

public class JuiceController {

    // Método para guardar el jugo
    public void saveJuice(FrmAddTypeJuice view) {
        // Obtener los datos desde la vista
        String juiceType = view.getJuiceType(); 
        String weightText = view.getWeight();

        // Validar que los campos no estén vacíos
        if (juiceType.isEmpty() || weightText.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Por favor, complete todos los campos.");
            return;
        }

        try {
            int weight = Integer.parseInt(weightText);  // Convertir peso a número entero

            // Crear un objeto Juice
            Juice juice = new Juice(juiceType, weight);

            // Llamar al DAO para insertar el jugo
            JuiceDAO juiceDAO = new JuiceDAO();
            juiceDAO.insertJuice(juice);  // Insertar el jugo en la base de datos

            // Limpiar los campos de la vista después de insertar
            view.clearFields();

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(view, "Jugo guardado exitosamente.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Por favor, ingrese un peso válido.");
        }
    }
}

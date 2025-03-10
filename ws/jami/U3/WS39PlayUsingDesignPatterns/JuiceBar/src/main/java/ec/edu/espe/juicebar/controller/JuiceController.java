package ec.edu.espe.juicebar.controller;

import ec.edu.espe.juicebar.model.Juice;
import javax.swing.JOptionPane;
import ec.edu.espe.juicebar.view.FrmAddTypeJuice;

public class JuiceController {

    // Este método se llama cuando se hace clic en "Save" en la vista
    public void saveJuice(FrmAddTypeJuice view) {
        // Obtener los datos del formulario
        String juiceType = view.getTxtJuiceType().getText();
        String weightText = view.getTxtWeight().getText();

        // Validar los datos ingresados
        if (juiceType.isEmpty() || weightText.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Por favor, complete todos los campos.");
            return;
        }

        try {
            int weight = Integer.parseInt(weightText); // Convertir el peso a un entero
            Juice juice = new Juice(juiceType, weight); // Crear el objeto Juice

            // Insertar el jugo en la base de datos utilizando JuiceDAO
            JuiceDAO juiceDAO = new JuiceDAO();
            juiceDAO.insertJuice(juice); // Insertar el jugo
            JOptionPane.showMessageDialog(view, "Jugo guardado exitosamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Por favor, ingrese un peso válido.");
        }
    }
}

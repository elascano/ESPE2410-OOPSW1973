/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Estudiante;
import model.ManageFileConnection;
import org.bson.Document;
import View.FrmMain;

public class Student implements ActionListener {

    public FrmMain frmMain;

    public Student(FrmMain frmMain) {
        this.frmMain = frmMain;
        
        this.frmMain.btn_registrar.addActionListener(this);

        llenargrip();

    }

    public void llenargrip() {

        MongoCollection<Document> collection = ManageFileConnection.getConexion().getCollection("estudiantes");

        DefaultTableModel tablamodel = (DefaultTableModel) this.frmMain.jtable_estudiantes.getModel();
        tablamodel.setRowCount(0);

        MongoCursor<Document> cursor = collection.find().iterator();

        while (cursor.hasNext()) {
            Document doc = cursor.next();

            String[] registro = new String[4];
            registro[0] = doc.getString("nombre");
            registro[1] = doc.getString("cedula");
            registro[2] = doc.getString("edad");
            registro[3] = doc.getString("fechaNacimiento");

            tablamodel.addRow(registro);
        }

        cursor.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.frmMain.btn_registrar) {

            // Obtener los valores de los campos de texto
            String nombre = this.frmMain.txt_nombre.getText();
            String cedula = this.frmMain.txt_cedula.getText();
            String edad = this.frmMain.txt_edad.getText();
            String fechaNacimientoStr = this.frmMain.txt_fecha_nac.getText();

            Estudiante estudiante = new Estudiante();
            estudiante.setNombre(nombre);
            estudiante.setCedula(cedula);
            estudiante.setEdad(edad);
            estudiante.setFechaNacimiento(fechaNacimientoStr);

            MongoDatabase db = ManageFileConnection.getConexion();
            MongoCollection<Document> collection = db.getCollection("estudiantes");

            Document estudianteDoc = new Document("nombre", estudiante.getNombre())
                    .append("cedula", estudiante.getCedula())
                    .append("edad", estudiante.getEdad())
                    .append("fechaNacimiento", estudiante.getFechaNacimiento());

            collection.insertOne(estudianteDoc);
            System.out.println("Estudiante registrado exitosamente");
            JOptionPane.showMessageDialog(frmMain, "Estudiante registrado exitosamente");
            llenargrip();

        }

    }

}

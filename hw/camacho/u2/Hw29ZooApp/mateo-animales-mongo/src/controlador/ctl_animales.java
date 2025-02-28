/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import modelo.Animal;
import modelo.mgl_conexion;
import vista.frm_main;

public class ctl_animales implements ActionListener {

    public frm_main frmMain;

    public ctl_animales(frm_main frmMain) {
        this.frmMain = frmMain;

        this.frmMain.btn_registrar.addActionListener(this);

        llenargrip();

    }

    public void llenargrip() {

        MongoCollection<Document> collection = mgl_conexion.getConexion().getCollection("animales");

        DefaultTableModel tablamodel = (DefaultTableModel) this.frmMain.jtable_animales.getModel();
        tablamodel.setRowCount(0);

        MongoCursor<Document> cursor = collection.find().iterator();

        while (cursor.hasNext()) {
            Document doc = cursor.next();

            String[] registro = new String[4];
            registro[0] = doc.getString("nombre");
            registro[1] = doc.getString("especie");
            registro[2] = doc.getString("raza");
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
            String especie = this.frmMain.txt_especie.getText();
            String raza = this.frmMain.txt_raza.getText();
            String fechaNacimientoStr = this.frmMain.txt_fecha_nac.getText();

            Animal animal = new Animal();
            animal.setNombre(nombre);
            animal.setEspecie(especie);
            animal.setRaza(raza);
            animal.setFechaNacimiento(fechaNacimientoStr);

            MongoDatabase db = mgl_conexion.getConexion();
            MongoCollection<Document> collection = db.getCollection("animales");

            Document animalDoc = new Document("nombre", animal.getNombre())
                    .append("especie", animal.getEspecie())
                    .append("raza", animal.getRaza())
                    .append("fechaNacimiento", animal.getFechaNacimiento());

            collection.insertOne(animalDoc);
            JOptionPane.showMessageDialog(frmMain, "Animal registrado exitosamente");
            llenargrip();
        }

    }
}

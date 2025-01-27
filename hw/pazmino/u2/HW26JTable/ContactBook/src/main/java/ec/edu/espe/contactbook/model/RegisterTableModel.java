package ec.edu.espe.contactbook.model;
import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Brandon Pazmino
 */

public class RegisterTableModel extends AbstractTableModel {

    private List<Object[]> data;
    private String[] columnNames;

    // Constructor para inicializar las columnas y los datos
    public RegisterTableModel(String[] columnNames, List<Object[]> data) {
        this.columnNames = columnNames;
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size(); // Número de filas
    }

    @Override
    public int getColumnCount() {
        return columnNames.length; // Número de columnas
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex]; // Devuelve el valor en una celda específica
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; // Devuelve el nombre de una columna
    }
}

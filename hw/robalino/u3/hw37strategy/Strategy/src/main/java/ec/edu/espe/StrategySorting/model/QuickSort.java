package ec.edu.espe.StrategySorting.model;

/**
 *
 * @author Benjamin R
 */
public class QuickSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        for (int i = 1; i < n; i++) {
            int key = data[i];  // Elemento actual a insertar
            int j = i - 1;

            // Mover los elementos mayores que "key" una posición adelante
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            
            // Insertar "key" en su posición correcta
            data[j + 1] = key;
        }
        return data;
    }
}

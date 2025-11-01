package Ordenamiento;
import java.util.Arrays;

public class InsertionSort {
    private int[] datos;
    public InsertionSort(int[] datos) {
       this.datos = datos;
    }

    public void sort() {
        for (int i = 1; i < datos.length; i++) {
            int aux = datos[i];
            int j = i - 1;
            while (j >= 0 && aux < datos[j]) {
                datos[j + 1] = datos[j];
                j = j - 1;
            }
            datos[j + 1] = aux;
        }
    }

    public String toString() {
        return Arrays.toString(datos);
    }
}

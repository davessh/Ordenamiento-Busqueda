package Ordenamiento;
import java.util.*;
public class SelectionSort {
    private int[] datos;
    public SelectionSort(int[] datos) {
        this.datos = datos;
    }

    public void sort() {
        for (int i = 0; i < datos.length - 1; i++) {
            int minimo = datos[i];
            int k = i;
            for (int j = i + 1; j < datos.length; j++) {
                if (datos[j] < minimo) {
                    minimo = datos[j];
                    k = j;
                }
            }
            datos[k] = datos[i];
            datos[i] = minimo;
        }
    }
    //[3, 5, 2, 4, 9, 11, 1]
    //[1, 5, 2, 4, 9, 11, 3]
    //[1, 2. 5, 4, 9, 11, 3]

    //[1, 2, 3, 4, 5, 11, 9]
    //[1, 2,3, 4, 5, 9, 11]
    public String toString(){
        return Arrays.toString(datos);
    }
}

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
    //[3, 5, 2, 4, 9, 11, 1]
    //[3,2,5,4,9,11,1]
    //[2, 3, 5, 4, 9, 11, 1]
    //[2, 3, 5, 5, 9, 11, 1]
    //[2, 3, 4, 5, 9, 11, 1]
    //[2, 3, 4, 5, 9, 11, 11]
    //[2, 3, 4, 5, 9 ,9, 11]
    //2, 3, 4, 5, 5, 9, 11]
    //[2, 3, 4, 4, 5, 9, 11]
    //[2, 3, 3, 4, 5, 9, 11]
    //[2,2 ,3 ,4 ,5 ,9 ,11]
    //[1, 2, 3, 4, 5, 9, 11]
    public String toString() {
        return Arrays.toString(datos);
    }
}

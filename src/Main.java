import Ordenamiento.InsertionSort;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] datos = {6,2,3,3,11,9,7,4,9,2};
        InsertionSort sort = new InsertionSort(datos);
        System.out.println("Antes de ordenar: " + Arrays.toString(datos));
        sort.sort();
        System.out.println("Despues de ordenar: " + sort);
    }
}
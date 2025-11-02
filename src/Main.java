import Ordenamiento.InsertionSort;
import Ordenamiento.SelectionSort;
import Ordenamiento.Shell;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] datos = {4,2,67,3,11,9,7,4,9,2};
        int[] datos2 = {4,4,6,3,2,54,7,5,9,2};
        int[] datos3 = {1,3,6,6,234,54,7,5,9,2};
        InsertionSort sort = new InsertionSort(datos);
        SelectionSort sort2 = new SelectionSort(datos2);
        Shell shell = new Shell(datos3);
        System.out.println("Insertion sort");
        System.out.println("Antes de ordenar: " + Arrays.toString(datos));
        sort.sort();
        System.out.println("Despues de ordenar: " + sort);
        System.out.println("Insertion sort");
        System.out.println("Antes de ordenar: " + Arrays.toString(datos2));
        sort.sort();
        System.out.println("Despues de ordenar: " + sort2);
        System.out.println("Shell sort");
        System.out.println("Antes de ordenar: " + Arrays.toString(datos3));
        shell.sort();
        System.out.println("Despues de ordenar: " + shell);
    }
}
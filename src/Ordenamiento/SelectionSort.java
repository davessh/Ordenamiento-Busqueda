package Ordenamiento;
import java.util.*;
public class SelectionSort {
    private int[] datos;
    public SelectionSort(int[] datos) {
        this.datos = datos;
    }

    public void sort(){
        for(int i = 1; i < datos.length - 1; i++){
            int minimo = datos[i];
            int k = i;
            for(int j = i+1; j < datos.length; j++){
                if(datos[j] < minimo){
                    minimo = datos[j];
                    k = j;
                }
                j = j + 1;
            }
            datos[k] = datos[i];
            datos[i] = minimo;
        }
    }

    public String toString(){
        return Arrays.toString(datos);
    }
}

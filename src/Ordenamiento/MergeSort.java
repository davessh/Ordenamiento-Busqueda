package Ordenamiento;

import java.util.Arrays;

public class MergeSort {
    private int[] datos;
    private int[] temp;

    public MergeSort(int[] datos) {
        this.datos = datos;
        this.temp = new int[datos.length];
    }

    public void sort() {
        mergeSort(0, datos.length - 1);
    }

    private void mergeSort(int izq, int der) {
        if (izq >= der)
            return;

        int medio = (izq + der) / 2;
        mergeSort(izq, medio);
        mergeSort(medio + 1, der);
        merge(izq, medio, der);
    }

    private void merge(int izq, int medio, int der) {
        int i = izq;
        int j = medio + 1;
        int k = izq;

        while (i <= medio && j <= der) {
            if (datos[i] <= datos[j])
                temp[k++] = datos[i++];
            else
                temp[k++] = datos[j++];
        }

        while (i <= medio)
            temp[k++] = datos[i++];

        while (j <= der)
            temp[k++] = datos[j++];

        for (i = izq; i <= der; i++)
            datos[i] = temp[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(datos);
    }
}

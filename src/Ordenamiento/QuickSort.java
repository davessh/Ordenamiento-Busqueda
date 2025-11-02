package Ordenamiento;

import java.util.Arrays;

public class QuickSort {
    private int[] A;

    public QuickSort(int[] A) {
        this.A = A;
    }

    public void sort() {
        quicksort(0, A.length - 1); // Llamada inicial (1,N) en pseudocódigo → (0, N-1) en Java
    }

    private void quicksort(int ini, int fin) {
        int izq = ini;
        int der = fin;
        int pos = ini;
        boolean band = true;
        int aux;

        while (band) {
            band = false;

            // Paso 2.1: mover der hacia la izquierda mientras A[pos] <= A[der] y pos != der
            while (A[pos] <= A[der] && pos != der) {
                der--;
            }

            // Paso 2.3
            if (pos != der) {
                aux = A[pos];
                A[pos] = A[der];
                A[der] = aux;
                pos = der;

                // Paso 2.3.1: mover izq hacia la derecha mientras A[pos] >= A[izq] y pos != izq
                while (A[pos] >= A[izq] && pos != izq) {
                    izq++;
                }

                // Paso 2.3.3
                if (pos != izq) {
                    band = true;
                    aux = A[pos];
                    A[pos] = A[izq];
                    A[izq] = aux;
                    pos = izq;
                }
            }
        }

        // Paso 4: recursión izquierda
        if ((pos - 1) > ini) {
            quicksort(ini, pos - 1);
        }

        // Paso 6: recursión derecha
        if (fin > (pos + 1)) {
            quicksort(pos + 1, fin);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(A);
    }
}

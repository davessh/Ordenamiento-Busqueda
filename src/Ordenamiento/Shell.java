package Ordenamiento;

import java.util.*;
public class Shell {
    private int[] datos;

    public Shell(int[] datos) {
        this.datos = datos;
    }
    //[3, 5, 2, 4, 9, 11, 1]
    //[3, 5, 2, 1, 9, 11, 4]
    //[1, 5, 2, 3, 9, 11, 4]
    //[1, 2, 5, 3, 9, 11, 4]
    //[1, 2, 3, 5, 9, 11, 4]
    //[1, 2, 3, 5, 9, 4, 11]
    //[1, 2, 3, 5, 4, 9, 11]
    //[1, 2, 3, 4, 5, 9, 11]

    public void sort() {
        int intervalo = datos.length;
        while (intervalo > 1) {
            intervalo = intervalo / 2;
            boolean band = true;
            while (band) {
                band = false;
                int indice = 0;
                while ((indice + intervalo) < datos.length) {
                    if (datos[indice] > datos[indice + intervalo]) {
                        int aux = datos[indice];
                        datos[indice] = datos[indice + intervalo];
                        datos[indice + intervalo] = aux;
                        band = true;
                    }
                    indice++;
                }
            }
        }
    }


    public String toString(){
        return Arrays.toString(datos);
    }
}

package Ordenamiento;

import java.util.*;
public class Shell {
    private int[] datos;

    public Shell(int[] datos) {
        this.datos = datos;
    }

    public void sort() {
        int inter = datos.length + 1;
        while (inter > 1) {
            inter = inter / 2;
            int bandera = 1;
            while (bandera == 1) {
                bandera = 0;
                int i = 0;
                while ((i + inter) < datos.length) {
                    if (datos[i] > datos[i + inter]) {
                        int aux = datos[i];
                        datos[i] = datos[i + inter];
                        datos[i + inter] = aux;
                        bandera = 1;
                    }
                    i = i + 1;
                }
            }
        }
    }

    public String toString(){
        return Arrays.toString(datos);
    }
}

package argentina_programa.claseTres.ejercicios;

import java.util.Arrays;

public class Ejercicio_ClaseTres_UnoB {

    public static void main(String[] args) {

        int cantidadNumeros = 3;
        int vectorNumeros[] = new int[]{2,5,4,8,6,6,8,2,5};
        char orden = 'a';
        int aux =0;
        for (int i = 0; i < vectorNumeros.length-1; i++) {
            for (int j = 0; j < vectorNumeros.length-i- 1; j++) {
                switch (orden) {
                    case 'a':
                        if (vectorNumeros[j]>vectorNumeros[j+1]) {
                            aux = vectorNumeros[j];
                            vectorNumeros[j] = vectorNumeros[j+1] ;
                            vectorNumeros[j + 1] = aux;
                        }
                    break;
                    case 'd':
                        if (vectorNumeros[j]<vectorNumeros[j+1]) {
                            aux = vectorNumeros[j];
                            vectorNumeros[j] = vectorNumeros[j+1] ;
                            vectorNumeros[j + 1] = aux;
                        }
                    break;
                    default:
                        System.out.println("No selecciono un orden correcto");
                }
            }
        }

        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.println("Vector Numeros [" + i +"]: " +vectorNumeros[i]);
        }
    }

}

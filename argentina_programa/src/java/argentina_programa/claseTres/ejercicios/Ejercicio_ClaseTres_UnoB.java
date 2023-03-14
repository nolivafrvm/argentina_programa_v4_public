package argentina_programa.claseTres.ejercicios;

import java.util.Arrays;

public class Ejercicio_ClaseTres_UnoB {

    public static void main(String[] args) {

        //int cantidadNumeros = 3;
        // Metodo Burbuja
        int vectorNumeros[] = new int[]{2,40,23,5,7,2};
        char orden = 'd'; // cambiar a (ascendente) por d (descendente)
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

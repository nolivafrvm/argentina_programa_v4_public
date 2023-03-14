package argentina_programa.claseTres;

import java.util.Scanner;

public class ClaseTresArraysTest {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros:>");
        int cantNumeros = Integer.valueOf(inputScanner.nextLine());

        int cantidadNumerosSumar = cantNumeros;

        int numeros[] = new int[cantidadNumerosSumar];

        for (int i=0; i<=numeros.length-1;i++) {
            int numero = (int)(Math.random()*1001);
            System.out.println("Numeor " + numero);
            numeros[i] =  numero;
        }

        mostrarNumeros(numeros);
        suma(numeros);
        multiplicar(numeros);
    }

    static void mostrarNumeros(int numeros[]) {
        System.out.println("La cantidad de numeros es: " + numeros.length);
        for (short i=0; i<=numeros.length-1; i++) {
            System.out.println("Numero Posición: [" + i + "]: " + numeros[i]);
        }

    }

    static void suma(int numeros[]) {
        int suma = 0;
        for (int i=0; i<=numeros.length-1; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("Suma: " + suma);
    }

    static void multiplicar(int numeros[]) {
        int multiplicacion = 1;
        for (int i=0; i<=numeros.length-1; i++) {
            numeros[i] = i +1;
            multiplicacion = multiplicacion * numeros[i];
        }
        System.out.println("Multiplicación: " + multiplicacion);
    }

}

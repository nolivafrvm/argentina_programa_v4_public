package argentina_programa.claseCuatro;

import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los numeros separados por un espacio:");

        String entradaScanner = scanner.nextLine();
        String[] numeros = entradaScanner.split(" ");

        int resultado =0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = Integer.parseInt(numeros[i]);
            resultado = resultado + numero;
        }
        System.out.println("El resultado es " + resultado);
    }

}

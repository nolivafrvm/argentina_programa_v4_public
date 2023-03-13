package argentina_programa.claseTres.ejercicios;

import java.util.Scanner;

public class Ejercicio_ClaseTres_UnoC_A {

    public static void main(String[] args) {
        int numeroX = 15;

        int vectorNumero[] = generarVectorNumerico();

        int resultado = sumaVectorNumero(vectorNumero, numeroX);

        System.out.println("La suma de los numeros es: " + resultado);

        int vectorNumeroDos[] = generarVectorNumerico();

        int resultadoUno = sumaVectorNumero(vectorNumeroDos, numeroX);

        System.out.println("La suma de los numeros es: " + resultadoUno);






//        int vectorNumeroMultiplicar[] = generarVectorNumerico();
//
//        int resultadoMultiplicacion[] = multiplicadoVectorNumero(vectorNumeroMultiplicar, numeroX);
//
//        for (int i = 0; i <resultadoMultiplicacion.length ; i++) {
//            System.out.println("VectorMultiplicado" + resultadoMultiplicacion[i]);
//        }
    }

    // Modo acceso // Static o no // tipo dato retorno // nombreMetodo (argumentos)
    static int[] generarVectorNumerico() {
        // Entrada de consola / terminal
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros:>");
        int cantNumeros = Integer.valueOf(inputScanner.nextLine());

        int vectorNumero[] = new int[cantNumeros];

        for (int i=0; i<vectorNumero.length;i++) {
            int numero = (int)(Math.random()*100);
            System.out.println("Numero: " + numero);
            vectorNumero[i] =  numero;
        }

        return vectorNumero;
    }

    static int sumaVectorNumero(int[] vectorNumero, int numeroX) {
        int resultado=0;
        for (int i = 0; i <= vectorNumero.length-1; i++) {
            if (vectorNumero[i] > numeroX) {
                resultado+=vectorNumero[i];
                //resultado = resultado + vectorNumero[i];
            }
        }
        return resultado;
    }

    static int[] multiplicadoVectorNumero(int[] vectorNumero, int numeroX) {
        for (int i = 0; i <= vectorNumero.length-1; i++) {
            vectorNumero[i] = vectorNumero[i] * numeroX;
        }
        return vectorNumero;
    }

}

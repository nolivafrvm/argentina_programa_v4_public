package argentina_programa.claseTres.ejercicios;

public class Ejercicio_ClaseTres_UnoC {


    public static void main(String[] args) {

        int numeroX = 10;
        int vectorNumero[] = new int[] {15,5,2,14,2,5,21,51};
        int resultado = 0;

        for (int i = 0; i <= vectorNumero.length-1; i++) {
            if (vectorNumero[i] > numeroX) {
                resultado+=vectorNumero[i];
            }
        }
        System.out.println("La suma de los numeros es: " + resultado);
    }
}

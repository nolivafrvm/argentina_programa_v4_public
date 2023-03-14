package argentina_programa.claseTres.ejercicios;

public class Ejercicio_ClaseTres_UnoA {

    public static void main(String[] args) {

        // Input Datos
        String texto = "Cuantas veces aparece la letra en este String";
        char letra = 'a';

        // Proceso
        int contadorLetra=0;

        for (int i = 0; i <= texto.length()-1; i++) {
            if (texto.charAt(i)==letra) {
                contadorLetra++;
            }
        }

        // Salida
        System.out.println("En el texto \"" + texto + "\" \nLa cantidad de veces que aparece la letra \"" + letra + "\" es: " + contadorLetra);

    }





}

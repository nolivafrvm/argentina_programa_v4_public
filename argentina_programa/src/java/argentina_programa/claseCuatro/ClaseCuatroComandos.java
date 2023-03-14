package argentina_programa.claseCuatro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class ClaseCuatroComandos {

    // Crear previamente un archivo en C:\Testing\test.txt

    public static void main(String[] args) throws IOException {

        // Pasos para leer las lineas de un archivo de texto plano .txt

        // Instancio un objeto path que define la ruta del archivo
        // Para Windows Ejemplo de directorio: "C:\test\test.txt"
        // Para Linux Ejemplo de directorio: "/home/user/test.txt"
        Path rutaArchivo = Paths.get("/home/noliva/test.txt");

        // Instancio una lista con todas las lineas del archivo y paso como parametro
        // en el readlines el path previamente Instanciado
        List<String> listString = Files.readAllLines(rutaArchivo);

        // Muestro las lineas que tiene el archivo
        System.out.println(listString);

        // Pasos para grabar en un archivo de texto plano
        for (int i = 0; i < 9; i++) {
            String numero = String.valueOf(Math.random()*100);
            System.out.println(numero);
            Files.writeString(rutaArchivo, "Grabo numero: " + numero + "\n", StandardOpenOption.APPEND);
        }
    }

}

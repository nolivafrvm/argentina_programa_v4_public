package argentina_programa.claseCuatro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ClaseCuatroComandos {

    // Crear previamente un archivo en C:\Testing\test.txt

    public static void main(String[] args) throws IOException {


        // Pasos para leer las lineas de un archivo de texto plano .txt

        // Instancio un objeto path que define la ruta del archivo
        Path rutaArchivo = Paths.get("C:\\test\\test.txt");

        // Instancio una lista con todas las lineas del archivo y paso como parametro
        // en el readlines el path previamente Instanciado
        List<String> listString = Files.readAllLines(rutaArchivo);

        // Muestro las lineas que tiene el archivo
        System.out.println(listString);

        // Pasos para grabar en un archivo de texto plano

        Files.writeString(rutaArchivo, "Esto es una prueba de write");







        
    }

}

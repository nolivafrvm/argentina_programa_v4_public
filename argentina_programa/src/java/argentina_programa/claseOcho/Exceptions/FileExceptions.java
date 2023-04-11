package argentina_programa.claseOcho.Exceptions;

import argentina_programa.claseCinco.turnero.servicios.FileServicio;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileExceptions {

    //    private static final String absoluthPath = "/home/noliva/" ; // Para linux
    private static final String absoluthPath = "C:\\appTurnero\\" ; // Para windows

    public static void main(String[] args) throws IOException {

        // Metodos sin tratamiento de excepciones
        escribirArchivoSinTratamiento("pepe.txt", "nada");
        leerArchivoSinTratamiento("pepe.txt");

        // Metodos con tratamiento de excepciones
        escribirArchivoConTratamiento("pepe.txt", "nada");
        leerArchivoConTratamiento("pepe.txt");

    }




    private static boolean escribirArchivoSinTratamiento(String archivo, String textoAGrabar) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");
        Files.writeString(rutaArchivo, textoAGrabar + "\n", StandardOpenOption.APPEND);
        return true;
    }

    private static List<String> leerArchivoSinTratamiento(String archivo) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");
        List<String> textoLeido = Files.readAllLines(rutaArchivo);
        System.out.println("Error al intentar leer el archivo" + archivo + ".txt -> Exception:");
        return textoLeido;
    }

    private static boolean escribirArchivoConTratamiento(String archivo, String textoAGrabar) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");

        try { // Estructura de control de excepciones
            Files.writeString(rutaArchivo, textoAGrabar + "\n", StandardOpenOption.APPEND);
            return true;
        } catch (NoSuchFileException noSuchFileException) {
            System.out.println("Error al intentar escribir");
        } finally {
            return false;
        }
    }

    private static List<String> leerArchivoConTratamiento(String archivo) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");
        try { // Estructura de control de excepciones
            List<String> textoLeido = Files.readAllLines(rutaArchivo);
            return textoLeido;
        } catch (IOException ioException) {
            System.out.println("Error al intentar leer el archivo" + archivo + ".txt -> Exception: " + ioException);
        }
        return null;
    }


}

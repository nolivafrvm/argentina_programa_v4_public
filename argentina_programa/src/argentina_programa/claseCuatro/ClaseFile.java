package argentina_programa.claseCuatro;

import java.io.*;

public class ClaseFile {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\test\\test.txt");

        if (!file.exists()) {
            System.out.println("El file no existe");
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bf = new BufferedReader(fileReader);
        String line = bf.readLine();
        line = bf.readLine();
        System.out.println(line);

    }
}

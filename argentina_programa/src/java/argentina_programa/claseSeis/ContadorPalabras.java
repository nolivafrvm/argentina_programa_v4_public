package argentina_programa.claseSeis;

public class ContadorPalabras {

    public int cuentaPalabras(String texto) {
        String arrayPalabras[] = texto.split(" ");
        return arrayPalabras.length;
    }

}

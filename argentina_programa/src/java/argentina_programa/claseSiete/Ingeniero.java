package argentina_programa.claseSiete;

public class Ingeniero extends Persona {

    public Ingeniero(String nombre) {
        super(nombre);
    }

    @Override
    public int correr() {
        return 7;
    }
}

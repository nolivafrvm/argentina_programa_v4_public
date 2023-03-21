package argentina_programa.claseSiete;

public class Deportista extends Persona {


    public Deportista(String nombre) {
        super(nombre);
    }

    @Override
    public int correr() {
        return 3;
    }
}

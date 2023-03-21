package argentina_programa.claseSiete;

public abstract class Persona {

    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int correr();

    static String metodoClase() {
        return "Hola soy metodo de clase";
    }

}

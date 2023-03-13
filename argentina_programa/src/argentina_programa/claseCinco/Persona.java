package argentina_programa.claseCinco;

// DEFINICION DE CLASE
public class Persona {

    // VARIABLES DE INSTANCIA / PROPIEDADES
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private char letraCarnet;
    private boolean esSocio;
    private int cantidadHijos;
    private char colorOjos;

    // CONSTRUCTORES
    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nroDocumento='" + nroDocumento + '\'' +
                ", letraCarnet=" + letraCarnet +
                ", esSocio=" + esSocio +
                ", cantidadHijos=" + cantidadHijos +
                ", colorOjos=" + colorOjos +
                '}';
    }

    // GETTER & SETTER

    public char getLetraCarnet() {
        return letraCarnet;
    }

    public void setLetraCarnet(char letraCarnet) {
        this.letraCarnet = letraCarnet;
    }

    public char getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(char colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }
}

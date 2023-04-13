package argentina_programa.claseCinco.turnero.entidad;

public class Especialidad {

    private long id;
    private String nombre;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String grabarArchivo() {
        return id + ";" + nombre + ";" + descripcion;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

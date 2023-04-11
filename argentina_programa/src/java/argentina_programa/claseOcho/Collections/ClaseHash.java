package argentina_programa.claseOcho.Collections;

import java.util.Objects;

public class ClaseHash {

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

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ClaseHash claseHash = (ClaseHash) o;
//        return Objects.equals(nombre, claseHash.nombre) && Objects.equals(descripcion, claseHash.descripcion);
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion);
//        return 1;
    }
}

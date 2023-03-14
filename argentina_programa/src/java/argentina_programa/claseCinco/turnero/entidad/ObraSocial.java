package argentina_programa.claseCinco.turnero.entidad;

public class ObraSocial {

    private long id;
    private String nombre;
    private String nroTelefono;
    private String tokenAuthorizacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getTokenAuthorizacion() {
        return tokenAuthorizacion;
    }

    public void setTokenAuthorizacion(String tokenAuthorizacion) {
        this.tokenAuthorizacion = tokenAuthorizacion;
    }
}

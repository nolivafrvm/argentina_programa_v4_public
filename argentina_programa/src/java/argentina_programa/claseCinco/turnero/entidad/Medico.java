package argentina_programa.claseCinco.turnero.entidad;

public class Medico {

    private long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String nroMatricula;
    private String nroTelefono;
    private String email;
    private Especialidad especialidad;
    
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String grabarArchivo() {
        if (getEspecialidad() != null) {
            return id + ";" + nombre + ";" + apellido + ";" + dni + ";" + nroMatricula + ";" + nroTelefono + ";" + email + ";" + getEspecialidad().getId();
        } else {
            return id + ";" + nombre + ";" + apellido + ";" + dni + ";" + nroMatricula + ";" + nroTelefono + ";" + email + ";";
        }
    }
}

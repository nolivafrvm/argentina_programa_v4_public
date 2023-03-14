package argentina_programa.claseCinco.turnero.entidad;

import java.time.LocalDate;

public class Turno {

    private long id;
    private LocalDate fechaTurno;
    private Medico medico;
    private Paciente paciente;
    private String observaciones;
    private String estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(LocalDate fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String grabarArchivo() {
        return id + ";" + fechaTurno + ";" + getMedico().getId() + ";" + getPaciente().getId() + ";" + getEstado() + ";" + getObservaciones();
    }
}

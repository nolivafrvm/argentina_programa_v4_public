package argentina_programa.claseCinco.turnero.entidad;

import java.time.LocalDate;

public abstract class Notificacion {


    protected Turno turno;
    protected LocalDate fechaNotificacion;


    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public LocalDate getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(LocalDate fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public abstract String notificar();

}

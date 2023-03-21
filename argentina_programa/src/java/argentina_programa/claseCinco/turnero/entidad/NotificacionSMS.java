package argentina_programa.claseCinco.turnero.entidad;

import java.time.LocalDate;

public class NotificacionSMS extends Notificacion{

    private String nroTelefono;

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    @Override
    public String notificar() {
        return "notificar";
    }
}

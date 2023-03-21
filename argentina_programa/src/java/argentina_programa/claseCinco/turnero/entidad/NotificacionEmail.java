package argentina_programa.claseCinco.turnero.entidad;

import java.time.LocalDate;

public class NotificacionEmail extends Notificacion{

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String notificar() {
        return "Enviando por correo electronico " + email;
    }
}

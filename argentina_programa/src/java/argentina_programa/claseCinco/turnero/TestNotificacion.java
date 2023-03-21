package argentina_programa.claseCinco.turnero;

import argentina_programa.claseCinco.turnero.entidad.Notificacion;
import argentina_programa.claseCinco.turnero.entidad.NotificacionEmail;
import argentina_programa.claseCinco.turnero.entidad.NotificacionSMS;

public class TestNotificacion {

    public static void main(String[] args) {
        Notificacion noti = new NotificacionSMS();


        NotificacionSMS notificacionSMS = new NotificacionSMS();
        notificacionSMS.setNroTelefono("353752222");

        NotificacionEmail notificacionEmail = new NotificacionEmail();
        notificacionEmail.setEmail("nico@hotmail.com");

        System.out.println(notificacionSMS.notificar());
        System.out.println(notificacionEmail.notificar());
    }

}

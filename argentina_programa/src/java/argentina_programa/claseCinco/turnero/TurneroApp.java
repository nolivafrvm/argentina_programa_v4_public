package argentina_programa.claseCinco.turnero;

import argentina_programa.claseCinco.turnero.servicios.FileServicio;
import argentina_programa.claseCinco.turnero.servicios.ScannerServicio;
import argentina_programa.claseCinco.turnero.servicios.TurneroServicio;

import java.io.IOException;

public class TurneroApp {

    private static final FileServicio fileServicio = new FileServicio();
    private static final ScannerServicio scannerServicio = new ScannerServicio();
    private static final TurneroServicio turneroServicio = new TurneroServicio(fileServicio, scannerServicio);
    private static String opcionMenu = "-1";
    private static final String modoPanel = "admin"; // Usar admin o usuario

    public static void main(String[] args) throws IOException {
        // Controlando la creación de archivos necesarios
        System.out.println("Verificar la ruta absoluta dependiendo su sistema operativo...");
        turneroServicio.verificarArchivos();

        // Iniciando Menu
        while (!opcionMenu.equalsIgnoreCase("6")) {
            opcionMenu = turneroServicio.inicioTurnero(modoPanel);
            System.out.flush();
            if (modoPanel.equalsIgnoreCase("admin")) {   // Panel de administración
                switch (opcionMenu) {
                    case "1":
                        System.out.println("Ingresando a 1Registrar Especialidad");
                        turneroServicio.registrarEspecialidad();
                        break;
                    case "2":
                        System.out.println("Ingresando a Registrar Médico");
                        turneroServicio.registrarMedico();
                        break;
                    case "3":
                        System.out.println("Ingresando a Registrar Obra Social");
                        turneroServicio.registrarObraSocial();
                        break;
                    case "4":
                        System.out.println("Ingresando a ver pacientes");
                        turneroServicio.verPacientes();
                        break;
                    case "5":
                        System.out.println("Ingresando a ver pacientes");
                        turneroServicio.verTurnos();
                        break;
                    case "6":
                        System.out.println("Saliendo de la aplicación");
                        break;
                    default:
                        System.out.println("La opción que ingreso no existe.");
                }
            }     else {   // Panel de usuario
                switch (opcionMenu) {
                    case "1":
                        System.out.println("Ingresando a la funcionalidad para registrar un turno:");
                        break;
                    case "2":
                        System.out.println("Saliendo de la aplicación:");
                        opcionMenu = "6";
                        break;
                    default:
                        System.out.println("La opción que ingreso no existe.");
                }
            }
        }
    }
}

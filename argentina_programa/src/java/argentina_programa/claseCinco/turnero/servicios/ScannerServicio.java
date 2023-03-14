package argentina_programa.claseCinco.turnero.servicios;

import argentina_programa.claseCinco.turnero.entidad.Especialidad;
import argentina_programa.claseCinco.turnero.entidad.Medico;
import argentina_programa.claseCinco.turnero.entidad.ObraSocial;

import java.util.Scanner;

public class ScannerServicio {

    public String inicioTurnero(String modo) {
        // modo -> admin o usuario

        System.out.println("Bienvenido al Turnero App v1.0");
        System.out.println("-------------------------------");
        System.out.println("Seleccione una opción:");

        if (modo.equals("admin")) {
            System.out.println("1- Registrar Especialidad.");
            System.out.println("2- Registrar Medico.");
            System.out.println("3- Registrar Obra Social.");
            System.out.println("4- Ver Pacientes.");
            System.out.println("5- Ver Turnos.");
            System.out.println("6- Salir de la aplicación.");
        } else {
            System.out.println("1- Solicitar Turno.");
            System.out.println("2- Salir de la aplicación.");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opción>:");

        String opcion  = scanner.nextLine();
        return opcion;
    }

    public Especialidad registrarEspecialidad() {
        Especialidad especialidad = new Especialidad();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");

        String nombre  = scanner.nextLine();
        especialidad.setNombre(nombre);

        System.out.println("Ingrese el descripcion:");
        String descripcion = scanner.nextLine();
        especialidad.setDescripcion(descripcion);

        return especialidad;
    }

    public Medico registrarMedico() {
        Medico medico = new Medico();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre:");

        String nombre  = scanner.nextLine();
        medico.setNombre(nombre);

        System.out.print("Ingrese el apellido:");
        String apellido = scanner.nextLine();
        medico.setApellido(apellido);

        System.out.print("Ingrese el dni:");
        String dni = scanner.nextLine();
        medico.setDni(dni);

        System.out.print("Ingrese el Nro. Matricula:");
        String nroMatricula = scanner.nextLine();
        medico.setApellido(nroMatricula);

        System.out.print("Ingrese el Nro. Telefono:");
        String nroTelefono = scanner.nextLine();
        medico.setApellido(nroTelefono);

        System.out.print("Ingrese el e-mail:");
        String email = scanner.nextLine();
        medico.setApellido(email);
        
//        private Especialidad especialidad;

        return medico;
    }

    public ObraSocial registrarObraSocial() {
        ObraSocial obraSocial = new ObraSocial();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el Nombre:");

        String nombre  = scanner.nextLine();
        obraSocial.setNombre(nombre);

        System.out.print("Ingrese el Nro. Telefono:");
        String nroTelefono = scanner.nextLine();
        obraSocial.setNroTelefono(nroTelefono);

        return obraSocial;
    }

    

}

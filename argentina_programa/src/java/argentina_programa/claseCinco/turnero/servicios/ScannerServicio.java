package argentina_programa.claseCinco.turnero.servicios;

import argentina_programa.claseCinco.turnero.entidad.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
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

    public Medico registrarMedico(List<Especialidad> especialidades) {
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
        medico.setNroMatricula(nroMatricula);

        System.out.print("Ingrese el Nro. Telefono:");
        String nroTelefono = scanner.nextLine();
        medico.setNroTelefono(nroTelefono);

        System.out.print("Ingrese el e-mail:");
        String email = scanner.nextLine();
        medico.setEmail(email);

        System.out.println("Ingrese el ID de la especialidad correspondiente");
        especialidades.forEach(especialidad -> {
            System.out.println("ID: " + especialidad.getId() + " Nombre: " + especialidad.getNombre() + " Descripción: " + especialidad.getDescripcion()) ;
        });
        System.out.println("Especialidad elegida>:");
        String idEspecialidad = scanner.nextLine();
        especialidades.forEach(especialidad -> {
            if (String.valueOf(especialidad.getId()).equalsIgnoreCase(idEspecialidad)) {
                medico.setEspecialidad(especialidad);
            }
        });
        if (medico.getEspecialidad()==null) {
            System.out.println("La especialidad elegida no corresponde:");
        }
        
        return medico;
    }

    public Paciente registrarPaciente() {
        Paciente paciente = new Paciente();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre:");

        String nombre  = scanner.nextLine();
        paciente.setNombre(nombre);

        System.out.print("Ingrese el apellido:");
        String apellido = scanner.nextLine();
        paciente.setApellido(apellido);

        System.out.print("Ingrese el dni:");
        String dni = scanner.nextLine();
        paciente.setDni(dni);

        System.out.print("Ingrese el Nro. Telefono:");
        String nroTelefono = scanner.nextLine();
        paciente.setNroTelefono(nroTelefono);

        System.out.print("Ingrese el e-mail:");
        String email = scanner.nextLine();
        paciente.setEmail(email);

//        private Especialidad especialidad;

        return paciente;
    }

    public Turno registrarTurno(List<Medico> medicos) throws ParseException {
        Turno turno = new Turno();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fecha (Formato \"dd/MM/yyyy hh:mm\" 12):");
        String fecha = scanner.nextLine();

        LocalDate fechaValue= LocalDate.parse(fecha,  DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
        turno.setFechaTurno(fechaValue);

        System.out.println("Ingrese el medico que requiera:");
        medicos.forEach(medico -> {
//            System.out.println("Id:" + medico.getId() + " Nombre: " + medico.getNombre() + " Apellido " + " Especialidad: " + medico.getEspecialidad().getNombre());
            System.out.println("Id:" + medico.getId() + " Nombre: " + medico.getNombre() + " Apellido " + medico.getApellido() + " Especialidad: ");
        });

        String idMedico = scanner.nextLine();
        medicos.forEach(medico -> {
            if (idMedico.equalsIgnoreCase(String.valueOf(medico.getId()))) {
                turno.setMedico(medico);
            }
        });
        if (turno.getMedico()==null) {
            System.out.println("No se selecciono el medico correctamente");
        }

        System.out.println("Ingrese las observaciones: ");
        String observacion = scanner.nextLine();
        turno.setObservaciones(observacion);

        turno.setEstado("Iniciado");
        
        return turno;
    }

    public String solicitarDni() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su D.N.I:");

        String dni  = scanner.nextLine();

        return dni;
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

package argentina_programa.claseCinco.turnero.servicios;

import argentina_programa.claseCinco.turnero.entidad.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileServicio {

    private static final String absoluthPath = "/home/noliva/" ; // Para linux
//    private static final String absoluthPath = "C:\\appTurnero\\" ; // Para windows

    private boolean escribirArchivo(String archivo, String textoAGrabar) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");

        try { // Estructura de control de excepciones
            Files.writeString(rutaArchivo, textoAGrabar + "\n", StandardOpenOption.APPEND);
            return true;
        } catch (IOException ioException) {
            System.out.println("Error al intentar escribir");
        }
        finally {
            return false;
        }
    }

    private List<String> leerArchivo(String archivo) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");
        try { // Estructura de control de excepciones
            List<String> textoLeido = Files.readAllLines(rutaArchivo);
            return textoLeido;
        } catch (IOException ioException) {
            System.out.println("Error al intentar leer el archivo" + archivo + ".txt -> Exception: " + ioException);
        }
        return null;
    }

    public int traerUltimoId(String archivo) {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");
        try { // Estructura de control de excepciones
            List<String> textoLeido = Files.readAllLines(rutaArchivo);
            if (!textoLeido.isEmpty()) {
                // Significa que contiene algo
                String campos[] = textoLeido.get(textoLeido.size()-1).split(";");
                return Integer.valueOf(campos[0]) + 1;
            }
        } catch (IOException ioException) {
            System.out.println("Error al intentar leer el archivo" + archivo + ".txt -> Exception: " + ioException);
        }
        return 1;
    }

    public List<Paciente> listarPaciente() throws IOException {
        System.out.println("Listando los pacientes desde el archivo:");
        List<String> file_datos_paciente = leerArchivo("pacientes");

        List<Paciente> listaPaciente = new ArrayList<>();

        if (file_datos_paciente!=null) {
            file_datos_paciente.forEach(dato_paciente -> {
                String paciente[] = dato_paciente.split(";");
                Paciente objPaciente = materializarPaciente(paciente);
                listaPaciente.add(objPaciente);
            });
        }


        return listaPaciente;
    }

    public List<Turno> listarTurnos() throws IOException {
        System.out.println("Listando los turnos desde el archivo:");
        List<String> file_datos_turno = leerArchivo("turnos");

        List<Turno> turnos = new ArrayList<>();

        file_datos_turno.forEach(dato_turno -> {
            String turno[] = dato_turno.split(";");
            Turno objTurno = null;
            try {
                objTurno = materializarTurno(turno);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            turnos.add(objTurno);
        });

        return turnos;
    }

    public List<Medico> listarMedico() throws IOException {
        System.out.println("Listando los medicos desde el archivo:");
        List<String> file_datos_medicos = leerArchivo("medicos");

        List<Medico> medicos = new ArrayList<>();

        if (file_datos_medicos!=null) {
            file_datos_medicos.forEach(dato_medico -> {
                String medico[] = dato_medico.split(";");
                Medico objMedico = materializarMedico(medico);
                medicos.add(objMedico);
            });
        }

        return medicos;
    }

    public List<Especialidad> listarEspecialidades() throws IOException {
        System.out.println("Listando las especialidades desde el archivo:");
        List<String> file_datos_especialidades = leerArchivo("especialidades");

        List<Especialidad> especialidades = new ArrayList<>();

        if (file_datos_especialidades!=null) {
            file_datos_especialidades.forEach(especialidad -> {
                String arrayEspecialidad[] = especialidad.split(";");
                Especialidad objEspecialidad = materializarEspecialidad(arrayEspecialidad);
                especialidades.add(objEspecialidad);
            });
        }

        return especialidades;
    }

    public void registrarEspecialidad(Especialidad especialidad) throws IOException {
        escribirArchivo("especialidades", especialidad.grabarArchivo());
    }

    public void registrarMedico(Medico medico) throws IOException {
        escribirArchivo("medicos", medico.grabarArchivo());
    }

    public void registrarObraSocial(ObraSocial obraSocial) throws IOException {
        escribirArchivo("obrasociales", obraSocial.grabarArchivo());
    }

    public void registrarPaciente(Paciente paciente) throws IOException {
        escribirArchivo("pacientes", paciente.grabarArchivo());
    }

    public void registrarTurno(Turno turno) throws IOException {
        escribirArchivo("turnos", turno.grabarArchivo());
    }

    private Medico materializarMedico(String[] dato_medico) {
        Medico objMedico = new Medico();
        objMedico.setId(Long.valueOf(dato_medico[0]));
        objMedico.setNombre(dato_medico[1]);
        objMedico.setApellido(dato_medico[2]);
        objMedico.setDni(dato_medico[3]);
        objMedico.setNroMatricula(dato_medico[4]);
        objMedico.setNroTelefono(dato_medico[5]);
        objMedico.setEmail(dato_medico[6]);
        
        //objMedico.setEspecialidad(traerEspecialidad);

        return objMedico;
    }

    private Especialidad materializarEspecialidad(String[] dato_especialidad) {
        Especialidad objEspecialidad = new Especialidad();
        objEspecialidad.setId(Long.valueOf(dato_especialidad[0]));
        objEspecialidad.setNombre(dato_especialidad[1]);
        objEspecialidad.setDescripcion(dato_especialidad[2]);

        return objEspecialidad;
    }


    private Paciente materializarPaciente(String[] paciente) {
        Paciente objPaciente = new Paciente();
        objPaciente.setId(Long.valueOf(paciente[0]));
        objPaciente.setNombre(paciente[1]);
        objPaciente.setApellido(paciente[2]);
        objPaciente.setDni(paciente[3]);
        objPaciente.setNroTelefono(paciente[4]);
        objPaciente.setEmail(paciente[5]);

        return objPaciente;
    }

    private Turno materializarTurno(String[] datos_turno) throws IOException {
        Turno turno = new Turno();
        turno.setFechaTurno(LocalDate.parse(datos_turno[0]));
        turno.setEstado(datos_turno[1]);
        turno.setObservaciones(datos_turno[2]);
        turno.setMedico(traerMedico(Long.valueOf(datos_turno[3])));
        turno.setPaciente(traerPaciente(Long.valueOf(datos_turno[4])));

        return turno;
    }

    private Medico traerMedico(long id) throws IOException {
        List<Medico> medicos = listarMedico();
        Medico medicoBuscado = medicos.stream().filter(medico -> medico.getId()==id).findFirst().get();
        if (medicoBuscado != null) {
            return medicoBuscado;
        }
        System.out.println("No se encontro el medico");
        return null;
    }

    private Paciente traerPaciente(long id) throws IOException {
        List<Paciente> pacientes = listarPaciente();
        Paciente pacienteBuscado = pacientes.stream().filter(paciente -> paciente.getId()==id).findFirst().get();
        if (pacienteBuscado != null) {
            return pacienteBuscado;
        }
        System.out.println("No se encontro el paciente");
        return null;
    }

    public Paciente traerPacienteDni(String dni) throws IOException {
        List<Paciente> pacientes = listarPaciente();
        if (!pacientes.isEmpty()) {
            Optional<Paciente> pacienteBuscado = pacientes.stream().filter(paciente -> paciente.getDni().equalsIgnoreCase(dni)).findFirst();
            if (pacienteBuscado.isPresent()) {
                return pacienteBuscado.get();
            }
        }
        System.out.println("No se encontro el paciente");
        return null;
    }

    public void verificarArchivos() throws IOException {
        String arrayArchivos[] = new String[] {"turnos.txt", "medicos.txt", "especialidades.txt", "obrasociales.txt", "pacientes.txt"};
        for (int i = 0; i < arrayArchivos.length; i++) {
            System.out.println("Controlando la creacion del archivo: " + arrayArchivos[i]);
            Path path = Paths.get(absoluthPath + arrayArchivos[i]);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
        }
        System.out.println("-------------------------------");
    }

}

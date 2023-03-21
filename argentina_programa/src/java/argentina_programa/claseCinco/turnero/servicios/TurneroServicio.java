package argentina_programa.claseCinco.turnero.servicios;

import argentina_programa.claseCinco.turnero.entidad.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class TurneroServicio {

    private final FileServicio fileServicio;
    private final ScannerServicio scannerServicio;

    public TurneroServicio(FileServicio fileServicio, ScannerServicio scannerServicio) {
        this.fileServicio = fileServicio;
        this.scannerServicio = scannerServicio;
    }

    public Especialidad[] traerEspecialidades() {
        Especialidad[] especialidades = new Especialidad[5];
        return especialidades;
    }

    public String inicioTurnero(String modo) {
        // Usamos el servicio de scanner para mostrar el inicio del turnero
        return this.scannerServicio.inicioTurnero(modo);
    }

    public int traerUltimoId(String archivo) {
        return fileServicio.traerUltimoId(archivo);
    }

    public Especialidad registrarEspecialidad() throws IOException {
        // Usamos el servicio de scanner para obtener los datos de la especialidad
        Especialidad especialidad = scannerServicio.registrarEspecialidad();
        especialidad.setId(traerUltimoId("especialidades"));
        fileServicio.registrarEspecialidad(especialidad);

        return especialidad;
    }

    public Medico registrarMedico() throws IOException {
        // Usamos el servicio de scanner para obtener los datos del medico
        List<Especialidad> especialidades = fileServicio.listarEspecialidades();
        Medico medico = scannerServicio.registrarMedico(especialidades);
        medico.setId(traerUltimoId("medicos"));
        fileServicio.registrarMedico(medico);
        return medico;
    }

    public ObraSocial registrarObraSocial() throws IOException {
        // Usamos el servicio de scanner para obtener los datos de la obra social
        ObraSocial obraSocial = scannerServicio.registrarObraSocial();
        obraSocial.setId(traerUltimoId("obrasociales"));
        fileServicio.registrarObraSocial(obraSocial);
        return obraSocial;
    }

    public Turno registrarTurno() throws IOException, ParseException {
        String dni = scannerServicio.solicitarDni();
        Paciente paciente = fileServicio.traerPacienteDni(dni);
        if (paciente!=null) {
            // Paciente existe
            System.out.println("El D.N.I. Ingresado ya existe.");
        } else {
            paciente = this.scannerServicio.registrarPaciente();
            paciente.setId(traerUltimoId("pacientes"));
            fileServicio.registrarPaciente(paciente);
        }
        List<Medico> medicos = fileServicio.listarMedico();
        Turno turno = scannerServicio.registrarTurno(medicos);
        turno.setId(traerUltimoId("turnos"));
        turno.setPaciente(paciente);
        fileServicio.registrarTurno(turno);
        return turno;
    }

    public List<Paciente> verPacientes() throws IOException {
        // Usamos el servicio de "file" para leer los datos de pacientes de un archivo
        return fileServicio.listarPaciente();
    }

    public List<Turno> verTurnos() throws IOException {
        // Usamos el servicio de "file" para leer los datos de turnos de un archivo
        return fileServicio.listarTurnos();
    }

    public void verificarArchivos() throws IOException {
        fileServicio.verificarArchivos();
    }

}

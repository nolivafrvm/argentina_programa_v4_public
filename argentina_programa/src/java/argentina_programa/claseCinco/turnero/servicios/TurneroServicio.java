package argentina_programa.claseCinco.turnero.servicios;

import argentina_programa.claseCinco.turnero.entidad.*;

import java.io.IOException;
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

    public Especialidad registrarEspecialidad() throws IOException {
        // Usamos el servicio de scanner para obtener los datos de la especialidad
        Especialidad especialidad = scannerServicio.registrarEspecialidad();
        fileServicio.registrarEspecialidad(especialidad);

        return especialidad;
    }

    public Medico registrarMedico() {
        // Usamos el servicio de scanner para obtener los datos del medico
        Medico medico = scannerServicio.registrarMedico();

        return medico;
    }

    public ObraSocial registrarObraSocial() {
        // Usamos el servicio de scanner para obtener los datos de la obra social
        ObraSocial obraSocial = scannerServicio.registrarObraSocial();
        return obraSocial;
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

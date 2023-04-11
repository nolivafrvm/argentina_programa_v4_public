package argentina_programa.claseSeis.services;

import argentina_programa.claseCinco.turnero.entidad.Medico;
import argentina_programa.claseCinco.turnero.entidad.Paciente;
import argentina_programa.claseCinco.turnero.entidad.Turno;
import argentina_programa.claseCinco.turnero.servicios.ConexionDAO;
import argentina_programa.claseCinco.turnero.servicios.TurneroDAO;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class ConexionDAOTest {


    private ConexionDAO conexionDAO;

    private TurneroDAO turneroDAO;

    @Test
    void test() throws Exception {
        conexionDAO = new ConexionDAO();
        conexionDAO.conectar();

        if (!conexionDAO.getConexion().isClosed()) {
            System.out.println("Estado conexion cerrada: " + conexionDAO.getConexion().isClosed());
        }
        conexionDAO.cerrar();
        if (conexionDAO.getConexion().isClosed()) {
            System.out.println("Estado conexion cerrada: " + conexionDAO.getConexion().isClosed());
        }
        Turno turnoParaCrear = crearTurno();
        turneroDAO = new TurneroDAO();

        turneroDAO.agregarTurno(turnoParaCrear);

        List<Turno> listaTurnos = turneroDAO.listarTurno();
        if (!listaTurnos.isEmpty()) {
            listaTurnos.forEach(turnoCreado -> {
                System.out.println(turnoCreado.toString());
            });
        }

    }

    private Turno crearTurno() {
        Turno turno = new Turno();
        turno.setEstado("Creado");
        turno.setObservaciones("Observaciones del turno");
        turno.setId(1L);

        Paciente paciente = crearPaciente();
        turno.setPaciente(paciente);

        Medico medico = crearMedico();
        turno.setMedico(medico);
        turno.setFechaTurno(LocalDate.now());

        return turno;
    }

    private Paciente crearPaciente() {
        Paciente paciente = new Paciente();
        paciente.setId(1);
        paciente.setDni("23331332");
        paciente.setNroTelefono("345464433");
        paciente.setNombre("Jose");
        paciente.setApellido("Perez");

        return paciente;
    }

    private Medico crearMedico() {
        Medico medico = new Medico();
        medico.setId(1L);
        medico.setNroMatricula("MT_10002");
        medico.setNroTelefono("353676766");
        medico.setApellido("Gomez");
        medico.setNombre("Juan");

        return medico;
    }

}

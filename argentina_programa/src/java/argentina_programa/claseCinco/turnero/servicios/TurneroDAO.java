package argentina_programa.claseCinco.turnero.servicios;

import argentina_programa.claseCinco.turnero.entidad.Medico;
import argentina_programa.claseCinco.turnero.entidad.Paciente;
import argentina_programa.claseCinco.turnero.entidad.Turno;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TurneroDAO extends ConexionDAO {

    public void agregarTurno(Turno turno) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.getConexion().prepareStatement("INSERT INTO tb_turno(id, fechaTurno,idMedico, idPaciente, observaciones, estado) VALUES(?,?,?,?,?,?)");
            st.setLong(1,turno.getId());
            st.setDate(2, Date.valueOf(turno.getFechaTurno()));
            st.setLong(3, turno.getMedico().getId());
            st.setLong(4, turno.getPaciente().getId());
            st.setString(5,turno.getObservaciones());
            st.setString(6,turno.getEstado());
            st.executeUpdate();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            this.cerrar();
        }
    }

    public List<Turno> listarTurno() throws Exception
    {
        List<Turno> listaTurno = new ArrayList();
        ResultSet reader;
        Turno objTurno = new Turno();
        try
        {
            this.conectar();
            PreparedStatement st = this.getConexion().prepareStatement("SELECT id, fechaTurno,idMedico, idPaciente, observaciones, estado FROM tb_turno");
            listaTurno = new ArrayList();
            reader = st.executeQuery();
            while (reader.next())
            {
                objTurno = new Turno();
                objTurno.setId(reader.getInt("id"));
                objTurno.setObservaciones(reader.getString("observaciones"));
                objTurno.setFechaTurno(LocalDate.parse(reader.getString("fechaTurno")));
                Paciente paciente = new Paciente();
                paciente.setId(reader.getLong("idPaciente"));
                objTurno.setPaciente(paciente);

                objTurno.setEstado(reader.getString("estado"));

                Medico medico = new Medico();
                medico.setId(reader.getLong("idMedico"));
                objTurno.setMedico(medico);
                listaTurno.add(objTurno);
            }
        } catch (Exception e)
        {
            throw e;
        }
        finally
        {
            this.cerrar();
        }
        return listaTurno;
    }

}

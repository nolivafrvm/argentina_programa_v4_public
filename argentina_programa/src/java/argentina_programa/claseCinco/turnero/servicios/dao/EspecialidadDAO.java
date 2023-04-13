package argentina_programa.claseCinco.turnero.servicios.dao;


import argentina_programa.claseCinco.turnero.entidad.Especialidad;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadDAO extends ConexionDAO {

    public void agregarEspecialidad(Especialidad especialidad) throws SQLException {
        try {
            this.conectar();
            String query = "INSERT INTO especialidades(id, nombre, descripcion) VALUES(?,?,?)";
            PreparedStatement ps = this.getConnection().prepareStatement(query);
            // DESMATERIALIZAMOS
            ps.setLong(1, especialidad.getId());
            ps.setString(2, especialidad.getNombre());
            ps.setString(3, especialidad.getDescripcion());
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            this.cerrarConexion();
        }
    }

    public List<Especialidad> listarEspecialidadesDB() {
        try {
            this.conectar();
            String sql = "SELECT id, nombre, descripcion FROM especialidades";
            PreparedStatement ps = this.getConnection().prepareStatement(sql);
            List<Especialidad> listaEspecialidad = new ArrayList<>();
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                // MATERIALIZAR EL OBJETO ESPECIALIDAD
                Especialidad especialidad = new Especialidad();
                especialidad.setId(result.getLong("id"));
                especialidad.setNombre(result.getString("nombre"));
                especialidad.setDescripcion(result.getString("descripcion"));
                listaEspecialidad.add(especialidad);
            }
            return listaEspecialidad;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ArrayList<>();
    }



}

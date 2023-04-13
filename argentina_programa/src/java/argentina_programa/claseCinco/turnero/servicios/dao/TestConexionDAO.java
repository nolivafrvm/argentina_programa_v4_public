package argentina_programa.claseCinco.turnero.servicios.dao;

import argentina_programa.claseCinco.turnero.entidad.Especialidad;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestConexionDAO {

    public static void main(String[] args) throws SQLException {
//        ConexionDAO conexionDAO = new ConexionDAO();
//        conexionDAO.conectar();

        Especialidad especialidad = new Especialidad();
        especialidad.setId(4);
        especialidad.setNombre("Pediatria");
        especialidad.setDescripcion("Rama de la medicina de los niños");
//
        EspecialidadDAO especialidadDAO = new EspecialidadDAO();
        especialidadDAO.eliminarEspecialidad(especialidad);


//        List<Especialidad> listaEspecialidad = new ArrayList<>();
//        listaEspecialidad = especialidadDAO.listarEspecialidadesDB();
//
//        if (!listaEspecialidad.isEmpty()) {
//            listaEspecialidad.forEach(especialidadDB -> {
//                System.out.println(especialidadDB.toString());
//            });
//        }

    }

}

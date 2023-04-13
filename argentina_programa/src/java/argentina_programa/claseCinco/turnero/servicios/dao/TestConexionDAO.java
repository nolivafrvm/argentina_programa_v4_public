package argentina_programa.claseCinco.turnero.servicios.dao;

import argentina_programa.claseCinco.turnero.entidad.Especialidad;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestConexionDAO {

    public static void main(String[] args) throws SQLException {
//        ConexionDAO conexionDAO = new ConexionDAO();
//        conexionDAO.conectar();

//        Especialidad especialidad = new Especialidad();
//        especialidad.setId(3);
//        especialidad.setNombre("Cardiologo");
//        especialidad.setDescripcion("Rama de la medicina del corazon");
//
        EspecialidadDAO especialidadDAO = new EspecialidadDAO();
//        especialidadDAO.agregarEspecialidad(especialidad);


        List<Especialidad> listaEspecialidad = new ArrayList<>();
        listaEspecialidad = especialidadDAO.listarEspecialidadesDB();

        if (!listaEspecialidad.isEmpty()) {
            listaEspecialidad.forEach(especialidadDB -> {
                System.out.println(especialidadDB.toString());
            });
        }

    }

}

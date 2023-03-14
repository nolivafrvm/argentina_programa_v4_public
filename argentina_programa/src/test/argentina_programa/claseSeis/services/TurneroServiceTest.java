package argentina_programa.claseSeis.services;

import argentina_programa.claseCinco.turnero.entidad.Especialidad;
import argentina_programa.claseCinco.turnero.servicios.FileServicio;
import argentina_programa.claseCinco.turnero.servicios.ScannerServicio;
import argentina_programa.claseCinco.turnero.servicios.TurneroServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class TurneroServiceTest {

    private final FileServicio fileServicio = mock(FileServicio.class);
    private final ScannerServicio scannerServicio = mock(ScannerServicio.class);

    private final TurneroServicio turneroServicio = new TurneroServicio(fileServicio, scannerServicio);

    @Test
    void registrarEspecialidad_ok() throws IOException {
        Especialidad especialidad = crearEspecialidad(1,"Pediatria", "Medicina para niños");
        Especialidad mockEspecialidad = crearEspecialidad(1,"Pediatria", "Medicina para niños");

        when(scannerServicio.registrarEspecialidad()).thenReturn(especialidad);
        doNothing().when(fileServicio).registrarEspecialidad(especialidad);

        Especialidad especialidadSaved = turneroServicio.registrarEspecialidad();

        assertNotNull(especialidadSaved);
        assertEquals(mockEspecialidad.getId(), especialidadSaved.getId());
        assertEquals(mockEspecialidad.getNombre(), especialidadSaved.getNombre());
        assertEquals(mockEspecialidad.getDescripcion(), especialidadSaved.getDescripcion());

    }

    private Especialidad crearEspecialidad(long id,String nombre, String descripcion) {
        Especialidad especialidad = new Especialidad();
        especialidad.setId(id);
        especialidad.setNombre(nombre);
        especialidad.setDescripcion(descripcion);

        return especialidad;
    }




}

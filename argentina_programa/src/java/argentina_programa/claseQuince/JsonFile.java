package argentina_programa.claseQuince;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFile {


    public static void main(String[] args) throws JsonProcessingException {

        Producto producto = new Producto();
        producto.setPrecio(52.0f);
        producto.setNombre("Plancha");
        producto.setStock(5);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonText = objectMapper.writeValueAsString( producto);
        System.out.println(jsonText);

    }

}

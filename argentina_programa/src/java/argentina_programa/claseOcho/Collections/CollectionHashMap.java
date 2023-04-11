package argentina_programa.claseOcho.Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {

    static HashMap claveValor = new HashMap();
    static Map<String, Object> mapValue = new HashMap<>();
    static HashMap<String, Integer> claveValorEspecifico = new HashMap();

    public static void main(String[] args) {
        claveValor.put("nico", "31");
        claveValor.put("juan", 25);
        claveValor.put("ezequiel", 52);
        claveValor.put("juana", 42);
        claveValor.put("mariana", 22);
        claveValor.put("betiana", 46);
        claveValor.put("albert", 57);
        claveValor.put("einstein", 65);

        claveValor.put("juan", 30);
        System.out.println("Juan tiene " + claveValor.get("juan"));


        // imprimir todos los valors
        claveValor.forEach((k,v) -> {
            System.out.println(k + " tiene " + v + " años de edad");
        });




    }

}

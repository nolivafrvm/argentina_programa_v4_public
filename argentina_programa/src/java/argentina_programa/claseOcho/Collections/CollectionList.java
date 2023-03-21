package argentina_programa.claseOcho.Collections;

import java.util.Arrays;
import java.util.List;

public class CollectionList {

    private static List<Integer> numeros = List.of(1,2,3,4,5);

    public static void main(String[] args) {

        numeros.forEach(numero -> {
            System.out.println(numero);
        });
    }

    static int suma(List<Integer> numeros) {
        int resultado = numeros.stream().mapToInt(num -> num.intValue() ).sum();
        return resultado;
    }

}

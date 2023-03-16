package argentina_programa.claseSiete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AppSieste {

    // Clase 7 // Herencia y Polimorfismo

    public static void main(String[] args) {

        // ------------------------------------------
        // Instancindo las clases concretas
        Ingeniero ing = new Ingeniero("Harry");
        Deportista dep = new Deportista("Potter");
        // ------------------------------------------

        Persona per1 = new Ingeniero("AlgoMas");
        Persona per2 = new Deportista("Alfonso");

        List<Persona> personas = Arrays.asList(ing,dep,per1,per2);

        OptionalDouble resultado  = calcularMediaVelocidad(personas);

        if (resultado.isPresent()) {
            System.out.println(resultado.getAsDouble());
        }

//        personas.stream().

    }

    public static OptionalDouble calcularMediaVelocidad(List<Persona> listaPersona) {
        return listaPersona.stream().mapToDouble(Persona::correr).average();
    }

}

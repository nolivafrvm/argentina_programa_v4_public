package argentina_programa.claseOcho.Exceptions;

import argentina_programa.claseSiete.Persona;

public class ClaseNullException {

    public static void main(String[] args) {
        conTratamiento();
        sinTratamiento();
    }

    static void sinTratamiento() {
        System.out.println("Ingresando a metodo sin tratamiento de excepciones");
        Persona persona = null;
        String nombre = persona.getNombre();
    }

    static void conTratamiento() {
        System.out.println("Ingresando a metodo con tratamiento de excepciones");
        try {
            Persona persona = null;
            persona.getNombre();
        } catch (NullPointerException ex) {
            System.out.println("Por favor instancia la persona.");
            ex.printStackTrace();
        }
        System.out.println("Hola el programa sigue en ejecución");
    }

}

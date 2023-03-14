package argentina_programa.claseTres;

/*
En la siguiente Clase vamos a utilizar la Clase String, sus propiedades y metodos.
 */

public class ClaseTresString {

    public static void main(String[] args) {

        // Definicion de las variables String
        String primerPalabra = "Hola";
        String segundaPalabra = "Como estas?";

        // Metodo length para obtener la longitud de la palabra
        System.out.println("La longitud de primerPalabra es: " + primerPalabra.length());
        System.out.println("La longitud de segundaPalabra es: " + segundaPalabra.length());

        // Metodos toUpperCase y toLowerCase para mayusculas y minusculas
        System.out.println("Primer palabra en Mayúscula: " + primerPalabra.toUpperCase());
        System.out.println("Primer palabra en Minúscula: " + primerPalabra.toLowerCase());


        System.out.println("Segunda palabra en Mayúscula: " + segundaPalabra.toUpperCase());
        System.out.println("Segunda palabra en Minúscula: " + segundaPalabra.toLowerCase());

        // Definimos un boolean "sonIguales" para ver si las palabras son iguales en caracteres
        boolean sonIguales = primerPalabra.equals(segundaPalabra);

        System.out.println("Son iguales? " + sonIguales);

        // Escribir la ultima letra de la variable primerPalabra con el metodo substring
        System.out.println("Escribimos primera palabra desde el indice 2: " + primerPalabra.substring(2)); // Escribe la palabra desde el indice (1)

        // La segunda letra de la primeraPalabra con el metodo chartAt
        char segundaLetra = primerPalabra.charAt(1);
        System.out.println("Segunda Letra: " + segundaLetra);

        // Concatenacion (Union) de primerPalabra y segundaPalabra
        String concatenacionPrimerSegundaPalabra = primerPalabra + " " + segundaPalabra;
        System.out.println(concatenacionPrimerSegundaPalabra);
        System.out.println("Largo de la palabra concatenada: " + concatenacionPrimerSegundaPalabra.length());

        // metodo contains para verificar si una cadena contiene una subcadena
        boolean contieneHo = concatenacionPrimerSegundaPalabra.contains("ho");
        System.out.println("Contiene HO: " + contieneHo);


        // Metodo startsWith para verificar si un String comienza con "Ho"
        boolean empiezaCon = primerPalabra.startsWith("Ho");
        System.out.println("Empieza con ho: " + empiezaCon);

        // Metodo endsWith para verificar si un String termina con "as?"
        boolean terminaCon = segundaPalabra.endsWith("as?");
        System.out.println("Termina con as?: " + terminaCon);

        // Metodo split para generar un arrays de string en base a una palabra y una expresion
        String[] partesDeUnString = segundaPalabra.split(" ");
        System.out.println("Palabras separadas de la segunda palabra segund (Espacio) :");
        for (int i=0; i< partesDeUnString.length;i++) {
            System.out.println(partesDeUnString[i]);
        }

        // Enter o cambio de linea -> se agrega \n
        String enter = "Hola que tal,\nmucho gusto";
        System.out.println(enter);

        // Tabulación -> \t
        String tabulacion = "Pedro\t18\tprogramador\n";
        System.out.println(tabulacion);

        // Escribir comillas dentro de un string -> se añade\"
        String escape = "hola, \"que tal\" ";
        System.out.println(escape);

        // Contrabarra \
        String contrabarra = "Esto es una contrabarra \\";
        System.out.println(contrabarra);

    }
}

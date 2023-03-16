package argentina_programa.claseSeis.cuentaPalabra;

import argentina_programa.claseSeis.ContadorPalabras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaPalabrasTest {

    @Test
    void cuentaPalabras_ok() {
        String textoAContar = "Java es un lenguaje de programación y una plataforma informática \n" +
                "que fue comercializada por primera vez en 1995 por Sun Microsystems.\u200B\n" +
                "El lenguaje de programación Java fue desarrollado originalmente por \n" +
                "James Gosling, de Sun Microsystems (constituida en 1983 y posteriormente \n" +
                "adquirida el 27 de enero de 2010 por la compañía Oracle),4\u200B y publicado \n" +
                "en 1995 como un componente fundamental de la plataforma Java de Sun Microsystems.\n" +
                "Su sintaxis deriva en gran medida de C y C++, pero tiene menos utilidades de bajo nivel que cualquiera de ellos. Las aplicaciones de Java son compiladas a bytecode (clase Java), que puede ejecutarse en cualquier máquina virtual Java (JVM) sin importar la arquitectura de la computadora subyacente.\n" +
                "\n" +
                "La compañía Sun desarrolló la implementación de referencia original para \n" +
                "los compiladores de Java, máquinas virtuales y librerías de clases en 1991,\n" +
                " y las publicó por primera vez en 1995. A partir de mayo de 2007, \n" +
                "en cumplimiento de las especificaciones del Proceso de la Comunidad Java, \n" +
                "Sun volvió a licenciar la mayoría de sus tecnologías de Java bajo la Licencia \n" +
                "Pública General de GNU. Otros han desarrollado también implementaciones \n" +
                "alternas a estas tecnologías de Sun, tales como el Compilador de Java de \n" +
                "GNU y el GNU Classpath.";

        ContadorPalabras contadorPalabras = new ContadorPalabras();
        int contador = contadorPalabras.cuentaPalabras(textoAContar);
        System.out.println("Las palabras contadas son: " + contador);

        assertEquals(199, contador);
    }

}

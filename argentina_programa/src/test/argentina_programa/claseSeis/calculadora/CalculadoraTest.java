package argentina_programa.claseSeis.calculadora;

import argentina_programa.claseSeis.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Testing de suma")
    void sumar_ok(){


        double resultado = calculadora.sumar(150, 30);

        assertEquals(180, resultado);
    }

    @Test
    void multiplicar_ok(){

        double resultado = calculadora.multiplicar(80, 3);

        assertEquals(240, resultado);
    }

    @Test
    void resta_ok(){
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.restar(90, 50);

        assertEquals(40, resultado);
    }

    @Test
    void sumar_dividir_ok(){
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.sumar(150, 180);
        resultado = calculadora.dividir(resultado, 3);

        assertEquals(110, resultado);
    }

    @Test
    void restar_multiplicar_ok(){

        double resultado = calculadora.restar(90, 50);
        resultado = calculadora.multiplicar(resultado, 15);

        assertEquals(600, resultado);
    }

    @Test
    void sumar_multiplicar_ok(){

        double resultado = calculadora.sumar(70, 40);
        resultado = calculadora.multiplicar(resultado, 25);

        assertEquals(2750, resultado);
    }
    
}

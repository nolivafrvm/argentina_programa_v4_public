package argentina_programa.claseCinco.carritoCompras;

import java.time.LocalDate;
import java.util.Scanner;

public class CarritoApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Cantidad de numeros: ");
        String cantidadNumeros = input.nextLine();

        if (Integer.parseInt(cantidadNumeros) <= Byte.MAX_VALUE) {
            byte numBytePrim = Byte.parseByte(cantidadNumeros);
            Byte numByte = new Byte(cantidadNumeros);
            System.out.println(numByte);
        } else {
            Byte numByte = new Byte(cantidadNumeros);
            System.out.println(numByte);
        }




        Integer numInteger = new Integer("12");
        int numInt = 2;


        Carrito carritoA = new Carrito();

        Persona persona = new Persona(); // Se esta instanciando el objeto "persona" de la clase "Persona"
        persona.setApellido("Potter");
        persona.setNombre("Harry");
        persona.setCantidadHijos(0);
        persona.setEsSocio(false);
        persona.setColorOjos('m');
        persona.setNroDocumento("41234123");

        carritoA.setPersona(persona);
        carritoA.setFechaCompra(LocalDate.now());

        Carrito carritoB = new Carrito();
        carritoB.setPersona(persona);





        System.out.println(persona);
//        System.out.println(persona.toString());

        Persona persona2 = new Persona("Nico", "Oliva");
        persona2.setNroDocumento("451522323");
        persona2.setEsSocio(true);

        Carrito carritoC = new Carrito();
        carritoC.setPersona(persona2);

//        System.out.println(persona2.toString());



    }

}

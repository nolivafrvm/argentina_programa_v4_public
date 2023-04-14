package argentina_programa.claseCinco.turnero.servicios;

public class TestExpresionRegular {
    public static void main(String[] args) {
        String expresionRegular = "[a-zA-Z][a-zA-Z]\\-[0-9]{4}";
        String stringAValidarTrue = "PD2-1234" ; // -> True
        String stringAValidarFalse = "As-5512"; // -> False;

        System.out.println("Validacion: " + stringAValidarTrue.matches(expresionRegular));
        System.out.println("Validacion: " + stringAValidarFalse.matches(expresionRegular));


    }
}

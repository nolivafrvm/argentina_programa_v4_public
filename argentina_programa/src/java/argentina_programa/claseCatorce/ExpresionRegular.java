package argentina_programa.claseCatorce;

import java.util.regex.Pattern;

public class ExpresionRegular {


    public static void main(String[] args) {
        String cbuExpresion = "[0-9]{22}";
        String cbuLiteral = "[A-Z]+\\.[A-Z]+\\.[A-Z]+";
        String cuil = "[0-9][0-9]\\-[0-9]{6,8}\\-[0-9]";
        String monto = "[0-9]+(\\.[0-9]{1,2})?";




        String linea = "ramonperez@gmail.com" ;
        String regex = "([a-z]|[0-9])+@[a-z]+\\.[a-z]+" ;
        final Pattern pattern = Pattern.compile(regex);
        pattern.matcher(linea).matches(); // -> True

        linea.matches("([a-z]|[0-9])+@[a-z]+\\.[a-z]+" ); // -> True
    }





}

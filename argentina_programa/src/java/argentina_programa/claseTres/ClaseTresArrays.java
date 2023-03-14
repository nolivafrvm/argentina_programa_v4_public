package argentina_programa.claseTres;

import java.util.Arrays;

public class ClaseTresArrays {

    public static void main(String[] args) {

        // String class
        String valueString = "VariableString";
        System.out.println("Esto es un String: " + valueString);

        String[] arrayString = {"Hola", "esto", "es" , "un", "string"};
        System.out.println("Recorriendo un array de strings:");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("String en posición array[" + i + "]: " + arrayString[i]);
        }
        
        // boolean Primitivo
        System.out.println();
        boolean valorBooleano = true;
        System.out.println("Esto es una valor booleano: " + valorBooleano);

        boolean[] arrayBoolean = new boolean[] {true, false, true, true, false};
        System.out.println("Reccoriendo un array de booleanos:");
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.println("boolean en posición array[" + i + "]: " + arrayBoolean[i]);
        }

        // Char Primitivo
        System.out.println();
        char valueChar = 'a';
        System.out.println("Esto es un Char: " + valueChar);

        char[] arrayChar =  {'a', 'e', 'i', 'o', 'u'} ;
        System.out.println("Recorriendo un array de char");
        for (int i=0;i<arrayChar.length;i++) {
            System.out.println("char en posición array[" + i + "]: " + arrayChar[i]);
        }


        // Short Primitivo
        System.out.println();
        short valueShort = 25677;
        System.out.println("Este es un short: " + valueShort);

        System.out.println("Recorriendo un array de short");
        short arrayShort[] = new short[] {1,6,7,256};
        for (int i = 0; i < arrayShort.length; i++) {
            System.out.println("short en posición array[" + i + "]: " + arrayShort[i]);
        }


        // Byte Primitivo
        System.out.println();
        byte valueByte = 127;
        System.out.println("Este es un byte: " + valueByte);
        byte arrayByte[] = new byte[3];
        arrayByte[0] = 25;
        arrayByte[1] = 50;
        arrayByte[2] = 75;
        System.out.println("Recorriendo un array de bytes");
        for (int i = 0; i < arrayByte.length; i++) {
            System.out.println("byte en posición array[" + i + "]: " + arrayByte[i]);
        }

        // int Primitivo
        System.out.println();
        int valueInt = 66;
        System.out.println("Este es un int " + valueInt);
        int arrayInt[] = new int[] {1, 5, 10, 15, 20, 53};
        System.out.println("Recorriendo un array int");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("int en posición array[" + i + "]: " + arrayInt[i]);
        }

        // long Primitivo
        System.out.println();
        long valueLong = 15;
        System.out.println("Este es un long: " + valueLong);
        long arrayLong[] = new long[] {16, 15, 7 , 2, 2023};
        System.out.println("Recorriendo un array long");
        for (int i = 0; i < arrayLong.length; i++) {
            System.out.println("long en posición array[" + i + "]: " + arrayLong[i]);
        }

        // float Primitivo
        System.out.println();
        float valueFloat = 2.344f;
        System.out.println("Este es el valor de float: " + valueFloat);
        float arrayFloat[] = new float[] {1.54f, 2.21f, 7.44f, 12.22234f};
        System.out.println("Recorriendo un array de float");
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.println("float en posición array[" + i + "]: " + arrayFloat[i]);
        }
        
        // double Primitivo
        System.out.println();
        double valueDouble = 1.68d;
        System.out.println("Este es el valor de double: " + valueDouble);
        double arrayDouble[] = new double[] {1.254d, 1.552d};
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println("double en posición array[" + i + "]: " + arrayDouble[i]);
        }
        
    }

}

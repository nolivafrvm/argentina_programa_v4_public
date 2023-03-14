package argentina_programa.claseCuatro;

public class ClaseParametros {

    public static void main(String[] args) {
        // Se pueden pasar parametros desde la consola o desde la configuracion del run
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}

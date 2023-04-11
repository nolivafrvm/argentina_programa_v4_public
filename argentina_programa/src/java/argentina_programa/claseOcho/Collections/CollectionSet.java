package argentina_programa.claseOcho.Collections;

import java.util.HashSet;

public class CollectionSet {

    private static HashSet hashSet = new HashSet();

    public static void main(String[] args) {
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);

        System.out.println(hashSet.size());

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);

        System.out.println(hashSet.size());

        ClaseHash claseHash_1 = new ClaseHash();
        claseHash_1.setNombre("nombre_1");
        claseHash_1.setDescripcion("descripcion_1");

        ClaseHash claseHash_2 = new ClaseHash();
        claseHash_2.setNombre("nombre_2");
        claseHash_2.setDescripcion("descripcion_2");

        hashSet = new HashSet();

        hashSet.add(claseHash_1);
        hashSet.add(claseHash_2);

        System.out.println(hashSet.size());


    }

}

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

    }

}

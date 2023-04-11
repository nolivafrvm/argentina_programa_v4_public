package argentina_programa.claseOcho.Collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {

    static Queue<Integer> arrayStack = new PriorityQueue();

    public static void main(String[] args) {

        arrayStack.add(6);
        arrayStack.add(5);
        arrayStack.add(2);
        arrayStack.add(8);
        arrayStack.add(10);
        arrayStack.add(23);
        arrayStack.add(54);

        Integer numPoll = null;

        arrayStack.forEach(number -> {
            System.out.println("Mostrando number" + number);
        });

        arrayStack.stream().forEach(number -> {
            System.out.println("Resultado: " + number);
        });

        Iterator<Integer> iter = arrayStack.iterator();
        while (iter.hasNext()) {
            Integer number = arrayStack.poll();
            System.out.println("Iterator: " + number);
        }

        System.out.println(arrayStack);

        numPoll = arrayStack.poll();
        System.out.println(numPoll);
        System.out.println(arrayStack);

        numPoll = arrayStack.poll();
        System.out.println(numPoll);
        System.out.println(arrayStack);

        numPoll = arrayStack.poll();
        System.out.println(numPoll);
        System.out.println(arrayStack);

        numPoll = arrayStack.poll();
        System.out.println(numPoll);
        System.out.println(arrayStack);

        numPoll = arrayStack.poll();
        System.out.println(numPoll);
        System.out.println(arrayStack);

        numPoll = arrayStack.poll();
        System.out.println(numPoll);
        System.out.println(arrayStack);

        numPoll = arrayStack.poll();
        System.out.println(numPoll);
        System.out.println(arrayStack);

    }

}

package queueProg;

import java.util.PriorityQueue;

public class ProprityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue();

        //Both add and offer method will return the boolean value based on the data insertion
        queue.add(44);
        System.out.println(queue);
        queue.offer(8);
        System.out.println(queue);
        queue.add(12);
        System.out.println(queue);
        queue.offer(6);
        System.out.println(queue);

        //Retrive the Head of the element
        System.out.println(queue.peek());
        System.out.println(queue.element());

        //Retrive and remove the head of the element
        System.out.println(queue.poll());//return 6 and remove that
        System.out.println(queue.remove());// return 8 and remove that

        System.out.println(queue);

    }
}

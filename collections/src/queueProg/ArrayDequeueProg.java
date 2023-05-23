package queueProg;

import java.util.ArrayDeque;

public class ArrayDequeueProg {
    public static void main(String[] args) {
        ArrayDeque dequeue=new ArrayDeque();//It maintains the order of insertion
        dequeue.add(44);
        System.out.println(dequeue);//[44]
        dequeue.offer(8);
        System.out.println(dequeue);//[44, 8]
        dequeue.add(12);
        System.out.println(dequeue);//[44, 8, 12]
        dequeue.offer(6);
        System.out.println(dequeue);//[44, 8, 12, 6]

        //Retrive the Head of the element
        System.out.println(dequeue.peek());//44
        System.out.println(dequeue.element());//44

        //Access the 1st and last element
        System.out.println(dequeue.peekFirst());//44
        System.out.println(dequeue.peekLast());//6

        //Adding the element at 1st and last
        System.out.println(dequeue.offerFirst(6));//true-added
        System.out.println(dequeue.offerLast(15));//true-added

        System.out.println(dequeue);

        //Retrive and remove the head of the element
        System.out.println(dequeue.poll());//return 44 and remove that
        System.out.println(dequeue.remove());// return 8 and remove that

        System.out.println(dequeue);
    }
}

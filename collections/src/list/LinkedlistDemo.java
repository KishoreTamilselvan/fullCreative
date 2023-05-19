package list;

import com.sun.jdi.Value;

import java.time.temporal.ValueRange;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList value=new LinkedList();
        value.add(3);
        value.add("Start");
        value.add(1);
        value.add(4);
        value.add(8);

        //Adding the element in between
        value.add(2,7);

        //Fetching the element using for-each loop
        for (Object i:value) {
            System.out.println(i);
        }
        System.out.println(value.get(3));//Accessing element using index is increase time complexity

    }
}

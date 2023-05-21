package set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Object> t=new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return +1;//Order of insertion is maintained
                return -1;//Reverse the order of insertion
//                return 0;//Only one value i.e., 1st
            }
        });
        t.add(new Employee(1404,"David"));
        t.add(new Employee(1402,"Mark"));
        t.add(new Employee(1406,"Denver"));
        t.add(new Employee(1407,"Tokyo"));
        t.add(new Employee(1409,"William"));
        System.out.println(t);

    }
}

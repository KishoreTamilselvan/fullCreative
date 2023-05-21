package set;

import java.util.TreeSet;

public class CustomSorting {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(2);
        t.add(5);
        t.add(0);
        t.add(1);
        t.add(6);
        System.out.println(t);
    }
}

package set.treesetComparator;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Object> t=new TreeSet(new IdCompare());
        t.add(new Employee(1404,"David"));
        t.add(new Employee(1402,"Mark"));
        t.add(new Employee(1406,"Denver"));
        t.add(new Employee(1407,"Tokyo"));
        t.add(new Employee(1409,"William"));

        for (Object e:t){
            System.out.println(e);
        }

        //System.out.println(t);
    }
}

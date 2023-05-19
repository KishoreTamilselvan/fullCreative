package set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        //TreeSet is a homogeneous collection By default it will sort the data in ascending order

        Set<Integer> coll2=new TreeSet();//Integer type of collection
        coll2.add(22);
        coll2.add(2);
        coll2.add(45);
        coll2.add(8);
        coll2.add(70);

        System.out.println(coll2);
    }
}

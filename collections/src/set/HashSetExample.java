package set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet coll1=new HashSet<>();
        coll1.add(22);
        coll1.add(2.44);
        coll1.add("Full");
        coll1.add('A');
        coll1.add(true);
        coll1.add(null);//one null value is allowed
        //order of insertion is not maintained
        System.out.println(coll1);
        //Accessing the elements
        for (Object i:coll1){
            System.out.println(i);
        }
    }
}

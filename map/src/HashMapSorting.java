import java.util.*;
import java.util.Map.Entry;

public class HashMapSorting {
    public static void main(String[] args) {
        HashMap pak=new HashMap();
        pak.put(7, "Dohni");
        pak.put(8, "Virat");
        pak.put(10, "Rohit");
        pak.put(1, "Smith");
        pak.put(22, "Warner");
        pak.put(2, "Maxwell");
        System.out.println(pak);//Before sorting

        //Using TreeMap Constructor
        TreeMap map=new TreeMap(pak);//By default it will sort based on key
        //or we can also use map.putAll(pak);
        System.out.println(map);
    }
}

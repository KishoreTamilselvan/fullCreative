import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> indmap = new HashMap<>();
        indmap.put(7, "Dohni");
        indmap.put(8, "Virat");
        indmap.put(10, "Rohit");
        System.out.println(indmap);

        Map<Integer,String> ausmap = new HashMap<>();
        ausmap.put(1, "Smith");
        ausmap.put(22, "Warner");
        ausmap.put(2, "Maxwell");
        System.out.println(ausmap);

        Map<Integer,String> finmap=new HashMap<>();
        finmap.putAll(indmap);
        finmap.putAll(ausmap);
        System.out.println(finmap);//{8=Virat, 1=Smith, 10=Rohit, 2=Maxwell, 22=Warner, 7=Dohni}

        //Replace value using overloaded replace() method
//        finmap.replace(2,"Raina");
        finmap.replace(2,"Maxwell","Denver");
        System.out.println(finmap);

        System.out.println(finmap.size());//6
        System.out.println(finmap.isEmpty());//false

        //iplmap.remove(22);//Warner removed

        System.out.println(finmap.containsKey(1));//true
        System.out.println(finmap.containsValue("Rohit"));//true
        System.out.println(finmap.get(8));//Virat
        System.out.println(finmap.size());//5
        System.out.println(finmap);//Before Adding the element
        finmap.put(45,"Dohni");
        System.out.println(finmap.entrySet());//Using entrySet() to get the set view
    }
}
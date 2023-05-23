import java.util.*;

public class MapAccess {
    public static void main(String[] args) {
        Map<Integer,String> map1= new HashMap<>();
        map1.put(101,"Full");
        map1.put(392,"Anywhere");
        map1.put(230,"Switchboard");
        map1.put(440,"AnswerConnect");
        map1.put(110,"YocoBoard");

        System.out.println(map1.keySet());//Set view of keys
        System.out.println(map1.values());//Collection view of values

        //Accessing the elements in the map
        for (Map.Entry e: map1.entrySet()) { //The return Type of entrySet() is set
            //Map.Entry is used to convert the set into entry object

            System.out.println(e.getKey()+"  "+e.getValue()); //These 2 methods are present in Entry Interface

            if(e.getKey().equals(440)){
                e.setValue("ChatSupport");
            }
        }

//        Set set = map1.entrySet();//Convert the map to set
//        Iterator iterator = set.iterator();//Iterate the set using iterator
//        while(iterator.hasNext())
//        {
//            //Convert the set into map.Entry to access the key and value
//            Map.Entry map = (Map.Entry)iterator.next();
//            System.out.println("Roll no: "+map.getKey()+"     Name: "+map.getValue());
//        }
//        Map<Integer, String> map = new HashMap(map1);
//        System.out.println(map);
    }
}

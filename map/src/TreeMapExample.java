import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> m=new TreeMap();
        m.put(1404,"David");
        m.put(1402,"Mark");
        m.put(1406,"Derlin");
        m.put(1403,"Denver");
        m.put(1440,"Antony");
        System.out.println(m);//By Default, it will sort it using Key
    }
}

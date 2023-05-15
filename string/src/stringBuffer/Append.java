package stringBuffer;

public class Append {
    public static void main(String[] args) {
        // Creating an object of StringBuffer class and passing random string
        StringBuffer s = new StringBuffer("Full");
        //System.out.println(s.capacity()); // 20
        // Usage of append() method
        s.append("Creative");
        //System.out.println(s.capacity()); // 20

        // Returns FullCreative
        System.out.println(s);

        s.append(1);
        // Returns FullCreative
        System.out.println(s);
    }
}

package stringBuffer;

public class Reverse {
    public static void main(String[] args) {
        // Creating a string via creating object of StringBuffer class
        StringBuffer s = new StringBuffer("BornToWin");

        // Invoking reverse() method
        s.reverse();

        // Returns "niWoTnroB"
        System.out.println(s);
    }
}

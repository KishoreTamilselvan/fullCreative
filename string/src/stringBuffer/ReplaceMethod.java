package stringBuffer;

public class ReplaceMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("BornToWin");
        s.replace(4, 6, "For");

        // Returns BornForWin
        System.out.println(s);
    }
}

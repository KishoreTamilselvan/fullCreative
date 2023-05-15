package stringBuffer;

public class DeleteMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("BornToWin");

        s.delete(0, 4);
        // Returns ToWin
        System.out.println(s);

        s.deleteCharAt(3);
        // Returns ToWn
        System.out.println(s);
    }
}

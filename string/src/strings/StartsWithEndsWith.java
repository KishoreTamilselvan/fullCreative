package strings;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        String str = "JavaScript";

        // checks if "JavaScript" starts with
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("ava"));//false
        // check if "JavaScript" ends with
        System.out.println(str.endsWith("Script"));//true
        System.out.println(str.endsWith("t"));//true
    }
}

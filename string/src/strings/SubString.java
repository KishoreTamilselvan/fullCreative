package strings;

public class SubString {
    public static void main(String[] args) {
        String str1 = "java is fun", s1="Kishore";
        String s2=new String("Kishore");
        String s3=new String("kishore");

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));// java
        // extract substring from index 3
        System.out.println(s1.substring(3));// hore

        //equals()
        System.out.println(s1.equals(s2));// true --> compare the states
        System.out.println(s1==s2);// false --> compare the address of the string
        //equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s3)); // true
    }
}

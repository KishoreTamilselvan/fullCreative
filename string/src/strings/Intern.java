package strings;

public class Intern {
    public static void main(String[] args) {
        //intern() is used to reduce the memory, it will store the object to SCP, so we can reuse it.
        String str1 = new String("xyz");
        String str2 = new String("xyz");

        // str1 and str2 doesn't share the same memory pool
        System.out.println(str1 == str2); // false

        // using the intern() method
        // now both str1 and str2 share the same memory pool
        str1 = str1.intern();
        str2 = str2.intern();

        System.out.println(str1 == str2); // true

        String s1="xyz";
        System.out.println(s1==str1);// true

    }
}

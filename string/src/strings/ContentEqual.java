package strings;

public class ContentEqual {
    public static void main(String[] args) {

        String str1 = "Java";
        StringBuffer sb1 = new StringBuffer("Java");

        System.out.println(str1.equals(sb1)); // false -- equals() is not overridden in stringBuffer
        //***If we need to compare the states of the string and stirngBuffer we use contentEquals()
        System.out.println(str1.contentEquals(sb1)); // true

//        String str = "Java";
//
//        String str1 = "Java";
//        StringBuffer sb1 = new StringBuffer("Java");
//        CharSequence cs1 = "Java";
//
//        String str2 = "JavA";
//        StringBuffer sb2 = new StringBuffer("JavA");
//        CharSequence cs2 = "JavA";
//
//        System.out.println(str.contentEquals(str1)); // true
//        System.out.println(str.contentEquals(sb1)); // true
//        System.out.println(str.contentEquals(cs1)); // true
//
//        System.out.println(str.contentEquals(str2)); // false
//        System.out.println(str.contentEquals(sb2)); // false
//        System.out.println(str.contentEquals(cs2)); // false
    }
}

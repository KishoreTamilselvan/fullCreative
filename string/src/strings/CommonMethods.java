package strings;

public class CommonMethods {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "Learn Kolin",s1="1234asdf";

        //UpperCase
        System.out.println(s1.toUpperCase());
        //LowerCase
        System.out.println(str2.toLowerCase());
        //Length
        System.out.println(str1.length());//Find the length of the string
        //isEmpty()
        System.out.println(str1.isEmpty());//Check the string is empty or not
        //concat()
        System.out.println(str1.concat(str2));//Add the string at the end of the 1st string

        int result;

        // comparing str1 with str2
        //if str1==str2 --> 0
        //if str1>str2 --> +ve
        //if str1<str2 --> -ve
        result = str1.compareTo(str2);// Compare string lexicographically(Dictionary order) based on Unicode

        System.out.println(result);

        //CompareToIgnoreCase() will compare the string by ignoring case

        //HashCode -- It will generate uniq number based on the String
        String s = "Java";
        String st = "Java Programming";
        String str = "";

        System.out.println(s.hashCode()); // 2301506
        System.out.println(st.hashCode()); // 1377009627

        // hash code of empty string is 0
        System.out.println(str.hashCode()); // 0


        //toCharArray()
        System.out.println(st.toCharArray());// Convert the string to character array

        //subSequence() -->Return string based on the start index and end index
        System.out.println(st.subSequence(3, 8)); // a Pro
    }
}

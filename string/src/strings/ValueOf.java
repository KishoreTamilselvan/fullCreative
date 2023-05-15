package strings;

import java.util.ArrayList;

public class ValueOf {
    public static void main(String[] args) {
//        String.valueOf(boolean b)
//        String.valueOf(char c)
//        String.valueOf(char[] data)
//        String.valueOf(double d)
//        String.valueOf(float f)
//        String.valueOf(int b)
//        String.valueOf(long l)
//        String.valueOf(Object o)
        int a = 5;
        long l = -2343834L;
        float f = 23.4f;
        double d = 923.234d;

        // convert numbers to strings
        System.out.println(String.valueOf(a));  // "5"
        System.out.println(String.valueOf(l));  // "-2343834"
        System.out.println(String.valueOf(f));  // "23.4"
        System.out.println(String.valueOf(d));  // "923.234"

        char c = 'J';
        char ch[] = {'J', 'a', 'v', 'a'};

        // convert char to string
        System.out.println(String.valueOf(c));  // "J"

        // convert char array to string
        System.out.println(String.valueOf(ch));  // "Java"

        char ch1[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int offset = 2;
        int length = 4;
        String result;

        // subarray {'o', 'g', 'r', 'm'} is converted to string
        result = String.valueOf(ch1, offset, length);

        System.out.println(result);  // "ogrm"

//        ArrayList<String> languages = new ArrayList<String>();
//        languages.add("Java");
//        languages.add("Python");
//        languages.add("Kotlin");
//
//        String result1;
//
//        // Output: "[Java, Python, Kotlin]"
//        result1 = String.valueOf(languages);
//
//        System.out.println(result1);

    }
}

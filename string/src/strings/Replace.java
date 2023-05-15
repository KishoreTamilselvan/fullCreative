package strings;

public class Replace {
    public static void main(String[] args) {
        //Replace
        String str1 = "bat ball";

        System.out.println(str1.replace('b', 'c'));// character replacement
        System.out.println(str1.replace("bat","car"));// String replacement

        //ReplaceAll
        String str3 = "aabbaaac";
        String str2 = "Learn223Java55@";

        String regex = "\\d+";// regex for sequence of digits

        // all occurrences of "aa" is replaceAll with "zz"
        System.out.println(str3.replaceAll("aa", "zz"));  // zzbbzzac

        // replace a digit or sequence of digits with a whitespace
        System.out.println(str2.replaceAll(regex, " "));  // Learn Java @

        String s1 = "aabbaaac";
        String s2 = "Learn223Java55@";

        // regex for sequence of digits
        String regex1 = "\\d+";

        // the first occurrence of "aa" is replaced with "zz"
        System.out.println(s1.replaceFirst("aa", "zz")); // zzbbaaac

        // replace the first sequence of digits with a whitespace
        System.out.println(s2.replaceFirst(regex, " ")); // Learn Java55@
    }
}

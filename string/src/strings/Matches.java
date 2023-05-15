package strings;

public class Matches {
    public static void main(String[] args) {
        //Syntax --->  string.matches(String regex)

        // four letter string that starts with 'J' and end with 'a'
        String regex = "^J..a$";
        System.out.println("Java".matches(regex));

        // five letter string that starts with 'a' and end with 's'
        String regex1 = "^a...s$";
        System.out.println("abs".matches(regex1)); // false
        System.out.println("alias".matches(regex1)); // true
        System.out.println("an abacus".matches(regex1)); // false
        System.out.println("abyss".matches(regex1)); // true

        // a search pattern for only numbers
        String regex2 = "^[0-9]+$";
        System.out.println("123a".matches(regex2)); // false
        System.out.println("98416".matches(regex2)); // true
        System.out.println("98 41".matches(regex2)); // false
    }
}

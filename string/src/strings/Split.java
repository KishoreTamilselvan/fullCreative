package strings;

public class Split {
    public static void main(String[] args) {
        String text = "Java is a fun programming language";

        String[] result = text.split(" ");// split string from space and returns the string array

        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }
    }
}

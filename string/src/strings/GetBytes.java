package strings;

import java.util.Arrays;

public class GetBytes {
    public static void main(String[] args) {
        String str = "Java";
        byte[] byteArray;

        // convert the string to a byte array
        // using platform's default charset
        byteArray = str.getBytes();
        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i]+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(byteArray));
    }
}

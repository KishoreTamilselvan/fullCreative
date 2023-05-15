import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithMultiResource {
    public static void main(String[] args) throws IOException {
        /*When multiple declarations are made, the try-with-resources statement closes
        these resources in reverse order. In this example, the PrintWriter object is closed
        first and then the Scanner object is closed.*/
        try (Scanner scanner = new Scanner(new File("testRead.txt"));PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }
}

//In Java 7 -->We should declare the statement locally

//try (Scanner scanner = new Scanner(new File("testRead.txt"))) {
//    // code
//}


//In Java 9 -->We can declare the object reference inside the try block

//Scanner scanner = new Scanner(new File("testRead.txt"));
//try (scanner) {
//    // code
//}

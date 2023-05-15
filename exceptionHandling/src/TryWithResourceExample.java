import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.*;

public class TryWithResourceExample {
    public static void main(String[] args) {
        String line;

        //automatic resource management
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
                //br.close();
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        } finally {
            //Here we can't use close() because the resource is automatically closed
            System.out.println("This  is finally block");
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class SerializationExample {
    static String file;
    static OutputStream fw;
    static ObjectOutputStream fow;
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //Create object for caller class
        CallerDetails caller=new CallerDetails();
        //ask the user to enter the path
        //System.out.println("Enter the path of the file");
        //getting the path
        //String path=s.nextLine();
        file="caller.txt";
        //passing that path to the constructor of fileoutputstream
        fw=new FileOutputStream(file);
        //connect the FOS to object output stream
        fow=new ObjectOutputStream(fw);
        //calling write method
        fow.writeObject(caller);
        System.out.println("Object has been serialized");
        //closing all the file
        fw.close();
        fow.close();

    }
}

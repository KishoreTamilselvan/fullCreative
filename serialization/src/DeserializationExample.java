import java.io.*;
import java.util.Scanner;

public class DeserializationExample {
    static InputStream fr;
    static ObjectInputStream fir;
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="/Users/kishore/IdeaProjects/fullCreative/caller.txt";
        fr=new FileInputStream(path);
        fir=new ObjectInputStream(fr);
        Object obj=fir.readObject();
        fr.close();
        fir.close();
        System.out.println(obj);;
    }
}

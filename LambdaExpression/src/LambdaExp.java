import java.io.Closeable;
import java.util.Collections;

public class LambdaExp {
    public static void main(String[] args) {
        //providing the implementation using lambda expression
        FuncInterface obj=(s) -> System.out.println("This is lambda expression in " +s);
        obj.func("Java");
    }
}

import java.util.Arrays;
import java.util.List;
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,5,6,2,3,5,7);

        long start=System.currentTimeMillis();

        //Returns the number of element present in the Stream
        System.out.println(list.parallelStream().count());//8



        //It removes the duplicate values in the Stream
        list.parallelStream()
                .distinct()
                .forEach(n -> System.out.println(n));

        //It returns boolean to based on the even numbers
        list.parallelStream()
                .map(n -> n%2==0)
                .forEach(n -> System.out.println(n));

        //Filter even numbers and sort and remove the duplicates and print
        list.parallelStream()
                .filter(n -> n%2==0)
                .sorted()
                .distinct()
                .forEachOrdered(n -> System.out.println(n));

        long end=System.currentTimeMillis();
        System.out.println("Total time taken for execution : "+ (end-start));
    }
}

package set;

import java.util.Comparator;
import java.util.stream.Collector;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
//        return +1;//Order of insertion maintained
//        return -1//reversing the order of insertion
//        return 0;//1st element only added

        //Converting the object into string
        Integer obj1=(Integer) o1;
        Integer obj2=(Integer) o2;

//        return obj1.compareTo(obj2);//Ascending order
//        return -(obj1.compareTo(obj2));//Descending order
        return obj2.compareTo(obj1);//Descending order
    }
}

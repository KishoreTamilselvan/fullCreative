package list;

import java.util.ArrayList;
import java.util.Iterator;

public class FetchingElements1 {
    public static void main(String[] args) {
        ArrayList collection1=new ArrayList<>();
        collection1.add(2);
        collection1.add(7);
        collection1.add(6.5);
        collection1.add(3);
        System.out.println(collection1);
        ArrayList ls=new ArrayList();
        ls.add(3);
        ls.add(4);
        collection1.add(2,ls);
        System.out.println(collection1);
        for (Object e:collection1) {
            System.out.println(e);
        }
//        Iterator itr= collection1.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}

package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class FetchingElements {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();//List of generic objects

        products.add("SwitchBoard");
        products.add("AnswerConnect");
        products.add("YocoBoard");
        products.add("Anywhere");
        products.add("AdaptiveU");
//        Iterator itr=products.iterator();//Using iterator method
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //Sort the collection
        Collections.sort(products);

        for (String e:products) {// Using for each loop //If collection is non-generic then we use object as a datatype
            System.out.println(e);
        }
        //Arraylist have indexing property so we can access the data by using get(index) method
    }
}

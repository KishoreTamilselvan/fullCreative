package list;

import java.util.ArrayList;

public class ArrayListProg {
    //It is a implementing class of list interface
    //Indexing property is there
    //we can have duplicate elements
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();//List of generic objects(
        ArrayList list=new ArrayList();//List of objects
        //Adding generic elements
        products.add("SwitchBoard");
        products.add("AnswerConnect");
        products.add("YocoBoard");
        products.add("Anywhere");
        products.add("AdaptiveU");
        //Adding the elements at particular index
        products.add(3,"Teleport");
        //products.add(true);//It will throw error because it is a string type of collection we can't add another object
        System.out.println(products);

        //Adding non-generic elements(everything is stored as a object)
        list.add(12);
        list.add('A');
        list.add("Full");
        list.add(22.34);
        list.add(true);
        System.out.println(list);
        int n= (int) list.get(0);//Type casting is required in non-generic collection

        //Adding the whole Collections
//        list.add(products);//It will add the hole set of collections in one index
//        System.out.println(list);
//        list.addAll(products);// It will add the elements in each index
//        System.out.println(list);

        //It will check all the elements of products reference is present or not
//        if(list.containsAll(products)) System.out.println("Yes list contains a products elements");

        //Check the required element present or not
        if(products.contains("YocoBoard")) System.out.println("The element is present");

        //Fetching the elements
        System.out.println(products.get(3));
        System.out.println(list.get(2));

        //Modify/Replace the elements
        products.set(1,"SetMore");
        System.out.println(products);
        list.set(1,"Creative");
        System.out.println(list);

        //Compare the objects
        System.out.println(products.equals(list));//false
        //Hashcode value of this collection
        System.out.println(products.hashCode());

        //Size of the elements
        System.out.println(products.size());

        //Remove/Delete the elements
        products.remove(3);//remove the elements using index
        System.out.println(products);
        products.remove("SetMore");//remove the elements using object
        System.out.println(products);

        //Remove all the elements of the collection
        products.clear();
        System.out.println(products);//[]-- empty collection

        //Check the collection is empty or not
        if(products.isEmpty()) System.out.println("This collection is empty");
    }
}

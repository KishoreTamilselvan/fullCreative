package set.treesetComparator;

import java.util.Comparator;

public class IdCompare implements Comparator<Employee>{

//    @Override
//    public int compare(Employee o1, Employee o2) {
//        Integer eid1=(Integer)o1.id;
//        Integer eid2=(Integer)o2.id;
//        return (eid1).compareTo(eid2);
//    }
    //Compare based on name
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.name).compareTo(o2.name);
    }

}

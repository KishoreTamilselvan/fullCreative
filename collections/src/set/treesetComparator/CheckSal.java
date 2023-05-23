package set.treesetComparator;

import set.treesetComparator.Employee;

import java.util.HashSet;

public class CheckSal {
    public static void main(String[] args) {
        HashSet<Employee> coll=new HashSet<>();
        coll.add(new Employee("Jack",18000));
        coll.add(new Employee("Mark",40000));
        coll.add(new Employee("Antony",25500));
        coll.add(new Employee("Derlin",23000));

        for (Employee e:coll){
            if(e.salary>25000){
                System.out.println(e);
            }
        }
    }
}

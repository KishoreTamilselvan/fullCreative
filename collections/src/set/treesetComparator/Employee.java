package set.treesetComparator;

import java.util.Comparator;

public class Employee{
    String name;
    int salary;
    int id;
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    Employee(int id, String name){
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString() {
        return "Employee{Emp.ID="+ id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

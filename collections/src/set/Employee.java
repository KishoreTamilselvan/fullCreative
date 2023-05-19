package set;

public class Employee {
    String name;
    double salary;
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

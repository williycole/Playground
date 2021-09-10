package LambdasRegexUnitTests.Lambas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasMain {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing")).start();

        Employee cole = new Employee("Cole Boren", 29);
        Employee madison = new Employee("Madison Boren", 25);
        Employee boba = new Employee("Boba Boren", 6);
        Employee niko = new Employee("Little Boy Boren", 3);

        List<Employee> employees = new ArrayList<>();
        employees.add(cole);
        employees.add(madison);
        employees.add(boba);
        employees.add(niko);


//        Collections.sort(employees, new Comparator<Employee>() {
//           @Override
//           public int compare(Employee employee1, Employee employee2){
//               return employee1.getName().compareTo(employee2.getName());
//           }
//        });


        // Same way as above but with a lambda function
        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
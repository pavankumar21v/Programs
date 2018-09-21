package main.java.com.core;

import main.java.com.pojo.Employee;

public class PassBy {
    public static void main(String args[]) {
        Employee emp1 = new Employee();
        emp1.setName("Pavan");

        Employee emp2 = new Employee();
        emp2.setName("Kumar");

        System.out.println("Before");
        System.out.println(emp1.getName());
        System.out.println(emp2.getName());

        swap(emp1, emp2);

        System.out.println("After");
        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
    }

    public static void swap(Employee e1, Employee e2) {
      /* Employee tmp = e1;
       e1 = e2;
       e2 = tmp;*/
        e1.setName("Kumar");
        e2.setName("Pavan");
    }
}

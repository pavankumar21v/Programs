package main.java.com.core;

import main.java.com.pojo.Employee;

public class EqualsHashCode {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Pavan");
        System.out.println("EMP " + emp.hashCode());

        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Pavan");
        System.out.println("EMP1 " + emp1.hashCode());

        System.out.println("EMP == EMP1 - " + (emp == emp1));
        System.out.println("EMP.equals(EMP1) - " + (emp.equals(emp1)));
    }
}

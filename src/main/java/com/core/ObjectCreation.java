package com.core;


import main.java.com.pojo.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectCreation {

    static final String OBJ_CLASS = "Emp.ser";

    public static void main(String[] args) {
        try {
            //Type 1
            Employee emp = new Employee();
            emp.setName("Pavan");
            System.out.println("new Employee() - " + emp.getName());

            //Type 2
            Employee emp1 = Employee.class.newInstance();
            emp1.setName("Pavan");
            System.out.println("Employee.class.newInstance() - " + emp1.getName());

            //Type 3
            Employee emp2 = (Employee) Class.forName("main.com.com.pojo.Employee").newInstance();
            emp2.setName("Pavan");
            System.out.println("Class.forName(\"Employee\").newInstance() - " + emp2.getName());
					
			/*FileOutputStream fout = new FileOutputStream(new File("./resources/" + OBJ_CLASS));  
			ObjectOutputStream out = new ObjectOutputStream(fout);  
			out.writeObject(emp);
			out.flush();*/

            //Type 4
            FileInputStream fin = new FileInputStream(new File("./resources/" + OBJ_CLASS));
            ObjectInputStream in = new ObjectInputStream(fin);
            Employee emp3 = (Employee) in.readObject();
            System.out.println("Deserialization - " + emp3.getName());

            in.close();
            fin.close();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

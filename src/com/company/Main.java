package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        new Thread(new CodeToRun()).start();


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the runnable");
//            }
//        }).start();
//    }

        new Thread(() ->{ System.out.println("Printing from the runnable");
            System.out.println("line 2");
            System.out.format("this is line %d\n", 3);
        }).start();

        Employee john = new Employee("john doe", 30);
        Employee tim = new Employee("tim buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Hank Snow",22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//        Collections.sort(employees, (Employee employee1, Employee employee2)->
//        employee1.getName().compareTo(employee2.getName()));

        Collections.sort(employees, (employee1, employee2)->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees
             ) {
            System.out.println( employee.getName());
        }
    }
}

//    class CodeToRun implements Runnable {
//        @Override
//        public void run() {
//            System.out.println("Printing from the runnable");
//        }
//    }


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

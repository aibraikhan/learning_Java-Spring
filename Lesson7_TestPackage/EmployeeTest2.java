package Lesson7_TestPackage;

import Lesson7_PackageAndAccessModifiers.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Den");
        employee1.showSurname();
        System.out.println();

        // The following line will not compile because the constructor in default access modifiers
        // Employee employee2 = new Employee(2);
        // employee2.showId();
        // System.out.println();

        // The following line will not compile because the constructor is private
        // Employee employee3 = new Employee(2000.5);

        Employee employee4 = new Employee(2, "Surge", 5000.0);
        employee4.showId();
        employee4.showSurname();
        employee4.showSalary();
    }
}

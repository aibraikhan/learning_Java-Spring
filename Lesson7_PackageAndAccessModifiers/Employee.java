package Lesson7_PackageAndAccessModifiers;

public class Employee {
    int id;
    public String surname;
    private double salary;


    public Employee(int getId, String getSurname, double getSalary) {
        id = getId;
        surname = getSurname;
        salary = getSalary;
    }

    Employee(int getId) {
        id = getId;
        System.out.println("This is your ID: " + id);
    }
    public Employee(String getSurname) {
        surname = getSurname;
        System.out.println("This is your surname: " + surname);
    }
    private Employee(double getSalary) {
        salary = getSalary;
        System.out.println("This is your salary: " + salary);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }
    public void showSurname() {
        System.out.println("Surname: " + surname);
    }
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }

    public void moreSalary() {
        salary*=2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Den");
        employee1.showSurname();
        System.out.println();

        Employee employee2 = new Employee(2);
        employee2.showId();
        System.out.println();

        // Employee employee3 = new Employee(2000.5); // The following line will not compile because the constructor is private

        Employee employee4 = new Employee(2, "Surge", 5000.0);
        employee4.showId();
        employee4.showSurname();
        employee4.showSalary();
    }
}


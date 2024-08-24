package Lesson5_ObjectsAndMethods;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee(int getId, String getSurname, int getAge, int getSalary, String getDepartment) {
        id = getId;
        surname = getSurname;
        age = getAge;
        salary = getSalary;
        department = getDepartment;
    }

        public void moreSalary() {
        salary*=2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Den", 18, 5000, "IT");
        System.out.println("Before " + employee1.surname + "'s promotion: " + employee1.salary);
        employee1.moreSalary();
        System.out.println("After " + employee1.surname + "'s  promotion: " + employee1.salary);

        Employee employee2 = new Employee(2, "Calvin", 22, 10000, "IT");
        System.out.println("Before " + employee2.surname + "'s  promotion: " + employee2.salary);
        employee2.moreSalary();
        System.out.println("After " + employee2.surname + "'s  promotion: " + employee2.salary);

    }
}

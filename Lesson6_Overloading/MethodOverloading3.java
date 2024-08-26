package Lesson6_Overloading;

import Lesson4_ClassAndObject.Lesson4;

public class MethodOverloading3 {
    int id;
    String name, lastName;
    int yearOfEducation;
    double averageGradeInMathematics;
    double averageGradeInEconomics;
    double averageGradeInForeignLanguage;

    MethodOverloading3(int getId, String getName, String getLastName, int getYearOfEducation, double getAverageGradeInMathematics,
                double getAverageGradeInEconomics, double getAverageGradeInForeignLanguage) {
        id = getId;
        name = getName;
        lastName = getLastName;
        yearOfEducation = getYearOfEducation;
        averageGradeInMathematics = getAverageGradeInMathematics;
        averageGradeInEconomics = getAverageGradeInEconomics;
        averageGradeInForeignLanguage = getAverageGradeInForeignLanguage;
    }
    MethodOverloading3(int getId2, String getName2) {
        this(getId2, getName2, "null", 0,
                0.0, 0.0, 0.0);
    }
    MethodOverloading3(){}


    public double calculateAverageGrade() {
        return (averageGradeInMathematics + averageGradeInEconomics + averageGradeInForeignLanguage) / 3;
    }
}



class StudentTest{
    public static void main(String[] args) {
        MethodOverloading3 student1 = new MethodOverloading3(1, "Stu", "Ard", 2024,
                4.5,4.8, 3.9);
        System.out.println("Student " + student1.name + " " + student1.lastName + " average grade: " + student1.calculateAverageGrade() + "\n");

        MethodOverloading3 student2 = new MethodOverloading3(2, "Daryl");
        System.out.println("ID: " + student2.id + "\nName: " + student2.name + "\nLastName: " + student2.lastName + "\n");

        MethodOverloading3 student3 = new MethodOverloading3();
        student3.id = 3;
        student3.name = "Daryl";
        System.out.println("ID: " + student3.id + "\nName: " + student3.name + "\n");
    }

}




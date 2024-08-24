package Lesson4_ClassAndObject;

public class Lesson4 {
        int id;
        String name, lastName;
        int yearOfEducation;
        double averageGradeInMathematics;
        double averageGradeInEconomics;
        double averageGradeInForeignLanguage;

        Lesson4(int getId, String getName, String getLastName, int getYearOfEducation, double getAverageGradeInMathematics,
                double getAverageGradeInEconomics, double getAverageGradeInForeignLanguage) {
            id = getId;
            name = getName;
            lastName = getLastName;
            yearOfEducation = getYearOfEducation;
            averageGradeInMathematics = getAverageGradeInMathematics;
            averageGradeInEconomics = getAverageGradeInEconomics;
            averageGradeInForeignLanguage = getAverageGradeInForeignLanguage;
        }

        public double calculateAverageGrade() {
            return (averageGradeInMathematics + averageGradeInEconomics + averageGradeInForeignLanguage) / 3;
        }
}



class StudentTest{
    public static void main(String[] args) {
        Lesson4 student1 = Student1();
        Lesson4 student2 = Student2();
        Lesson4 student3 = Student3();

        System.out.println("Student " + student1.name + " " + student1.lastName + "average grade: " + student1.calculateAverageGrade());
        System.out.println("Student " + student2.name + " " + student2.lastName + " average grade: " + student2.calculateAverageGrade());
        System.out.println("Student " + student1.name + " " + student1.lastName + " average grade: " + student3.calculateAverageGrade());
    }

    public static Lesson4 Student1() {
        Lesson4 student1 = new Lesson4(1, "Stu", "Ard", 2024,
                4.5,4.8, 3.9);
        return student1;
    }

    public static Lesson4 Student2() {
        Lesson4 student2 = new Lesson4(2, "Daryl", "Dix", 2025,
                4.1, 3.5, 3.7);
        return student2;
    }

    public static Lesson4 Student3() {
        Lesson4 student3 = new Lesson4(1, "Shadow", "Wall", 2024,
                5.5, 4.2, 3.3);
        return student3;
    }

}
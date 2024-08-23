package ClassAndObject;

public class Lesson4 {
        int id;
        String name, lastName;
        int yearOfEducation;
        double averageGradeInMathematics;
        double averageGradeInEconomics;
        double averageGradeInForeignLanguage;

        public double calculateAverageGrade() {
            return (averageGradeInMathematics + averageGradeInEconomics + averageGradeInForeignLanguage) / 3;
        }
}



class StudentTest{
    public static void main(String[] args) {
        Lesson4 student1 = Student1();
        Lesson4 student2 = Student2();
        Lesson4 student3 = Student3();

        System.out.println("Student 1 average grade: " + student1.calculateAverageGrade());
        System.out.println("Student 2 average grade: " + student2.calculateAverageGrade());
        System.out.println("Student 3 average grade: " + student3.calculateAverageGrade());
    }

    public static Lesson4 Student1() {
        Lesson4 student1 = new Lesson4();
        student1.id = 1;
        student1.name = "Stu";
        student1.lastName = "Ard";
        student1.yearOfEducation = 2024;
        student1.averageGradeInMathematics = 4.5;
        student1.averageGradeInEconomics = 4.8;
        student1.averageGradeInForeignLanguage = 3.9;
        return student1;
    }

    public static Lesson4 Student2() {
        Lesson4 student2 = new Lesson4();
        student2.id = 2;
        student2.name = "Daryl";
        student2.lastName = "Dix";
        student2.yearOfEducation = 2025;
        student2.averageGradeInMathematics = 4.1;
        student2.averageGradeInEconomics = 3.5;
        student2.averageGradeInForeignLanguage = 3.7;
        return student2;
    }

    public static Lesson4 Student3() {
        Lesson4 student3 = new Lesson4();
        student3.id = 1;
        student3.name = "Shadow";
        student3.lastName = "Wall";
        student3.yearOfEducation = 2024;
        student3.averageGradeInMathematics = 5.5;
        student3.averageGradeInEconomics = 4.2;
        student3.averageGradeInForeignLanguage = 3.3;
        return student3;
    }

}
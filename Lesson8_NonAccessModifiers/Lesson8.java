package Lesson8_NonAccessModifiers;

public class Lesson8 {

    // Task 1
    public static double sum(double a, double b, double c) {
        return a * b * c;
    }

    public static void divide(int a, int b) {
        int result = a/b;
        int remains = a%b;
        System.out.println("The result of divide " + a + " and " + b + " is: " + result);
        System.out.println("The remains of " + a + " and " + b + " is: " + remains + "\n");
    }


    // Task 2
    public static final double PI = 3.14;
    public double square(double r) {
        double s = PI * r * r;
        return s;
    }
    public static double lengthOfCircle(double r) {
        double l = 2 * PI * r;
        return l;
    }
    public void info(double r) {
        System.out.println("The radius:" + r);
        System.out.println("The square of the circle: " + square(r));
        System.out.println("The length of the circle: " + lengthOfCircle(r));
    }
}

class Test {
    public static void main(String[] args) {
        // 1 task
        int a = 4, b = 6, c = 8;

        double result = Lesson8.sum(a, b, c);
        System.out.println(result + "\n");
        result = Lesson8.sum(5, 10, 25);
        System.out.println(result + "\n");

        Lesson8.divide(a, b);
        Lesson8.divide(c, b);

        // 2 task
        int r = 5;
        System.out.println("The length of the circle: " + Lesson8.lengthOfCircle(r) + "\n");

        Lesson8 learn = new Lesson8();
        System.out.println("The square of the circle: " + learn.square(r) + "\n");
        learn.info(r);

    }
}
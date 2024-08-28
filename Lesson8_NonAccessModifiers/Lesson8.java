package Lesson8_NonAccessModifiers;

public class Lesson8 {

    static final double pi = 3.14;

    double square(double r) {
        double s = pi * r * r;
        return s;
    }
    static double lengthOfCircle(double r) {
        double l = 2 * pi * r;
        return l;
    }
    void show(double r) {
        System.out.println("The radius:" + r);
        Lesson8 learn = new Lesson8();
        System.out.println("The square of the circle: " + learn.square(r));
        System.out.println("The length of the circle: " + Lesson8.lengthOfCircle(r));
    }

    static int sum(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    static void divide(int a, int b) {
        int result = a/b;
        int remains = a%b;
        System.out.println("The result of divide " + a + " and " + b + " is: " + result);
        System.out.println("The remains of " + a + " and " + b + " is: " + remains + "\n");
    }
}

class Test {
    public static void main(String[] args) {
        // 1 task
        int a = 4, b = 6, c = 8;

        int result = Lesson8.sum(a, b, c);
        System.out.println(result + "\n");

        Lesson8.divide(a, b);
        Lesson8.divide(c, b);

        // 2 task
        int r = 5;
        System.out.println("The length of the circle: " + Lesson8.lengthOfCircle(r) + "\n");

        Lesson8 learn = new Lesson8();
        System.out.println("The square of the circle: " + learn.square(r) + "\n");
        learn.show(r);

    }
}
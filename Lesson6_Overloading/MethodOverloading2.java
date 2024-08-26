package Lesson6_Overloading;

public class MethodOverloading2 {

    int sum() {
        return 0;
    }
    int sum(int a) {
        return a;
    }
     int sum(int a, int b) {
        return a + b;
     }
     int sum(int a, int b, int c) {
        return a + b + c;
     }
    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO = new MethodOverloading2();

        System.out.println(mO.sum(1, 2, 3, 4));

        System.out.println(mO.sum());

        System.out.println(mO.sum(1, 2));

        System.out.println(mO.sum(1));

        System.out.println(mO.sum(1, 2, 3));
    }
}
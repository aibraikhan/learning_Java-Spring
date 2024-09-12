package Lesson19_VarargsAndCL;

public class Varargs {
    static void sum(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(5, 6, 4, 5, 6, 7, 78, 9);
    }

}

package Lesson19_VarargsAndCL;

public class Foreach {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        String[] stud = {"Jake", "Paul", "Hogan"};
        String[] exams = {"Math", "PE"};
        for (String s1 : stud) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }

        int[][] arr2 = {{1, 2, 3}, {5, 6}, {7, 8, 9, 0, 2, 5, 6, 7, 8}};
        for (int[] arrTemp : arr2) {
            for (int temp : arrTemp) {
                System.out.print(temp + " ");
            }
        }

    }
}

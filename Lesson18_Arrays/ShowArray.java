package Lesson18_Arrays;

public class ShowArray {
    public static void showArr(String[][] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length-1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < arr.length-1) {
                System.out.print(", ");
            }
            if (i < arr.length-1) {
                System.out.print("{" + arr[i+1][0] + "}");
            }
            if (i < arr.length-1) {
                System.out.print(", ");
            }

        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        String[][] array = {{"Hel", "lo"}, {"Wo", "rld"}, {"We", "sh"}};
        showArr(array);
    }
}

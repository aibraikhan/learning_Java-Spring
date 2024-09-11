package Lesson18_Arrays;

public class Sort {

    public static void sorting(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array1 = {3, 4, 5, 6, 71, 2, 4, -124, -442, -4, 4};
        sorting(array1);
    }
}

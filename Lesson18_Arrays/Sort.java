package Lesson18_Arrays;

public class Sort {

    public static int[] sorting(int[] array) {
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

        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {6, 5, 4, 3, 2, 71, 2, 4, -124, -442, -4, 4, 9, 8, 7};
        sorting(array1);
        System.out.print("Sorted array: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
    }
}

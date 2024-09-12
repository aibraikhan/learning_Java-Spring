package Lesson19_VarargsAndCL;

public class Test {
    public static String[] abc(String[]... s) {
        int length = 0;
        for (String[] s1 : s) {
            length += s1.length;
        }

        String[] result = new String[length];

        int i = 0;
        for (String[] s1 : s) {
            for (String s2 : s1) {
                result[i] = s2;
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] s1 = {"3", "2"};
        String[] s2 = {"2", "4", "5", "6", "7", "2", "2", "3", "4", "5", "6", "7"};
        String[] result = abc(s1, s2);

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : args) {
            for (int i = 0; i < result.length; i++) {
                if (s.equals(result[i])) {
                    result[i] = null;
                }
            }
        }

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

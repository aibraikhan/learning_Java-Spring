package Lesson17_StringBuilder;

public class Lesson17 {

    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() != sb2.length()) {
            System.out.println("false");
            return false;
        }

        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                System.out.println("false");
                return false;
            }
        }

        System.out.println("true");
        return true;
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        equality(sb1, sb2);

        System.out.println();

        StringBuilder sb3 = new StringBuilder("Wesh!");
        StringBuilder sb4 = sb2;
        equality(sb3, sb4);

    }
}

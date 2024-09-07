package Lesson16_String;

public class Email {

    public static void email(String s) {
        String w1 = "@";
        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith(w1, i)) {
                System.out.println(s.substring(i+1, s.indexOf('.', i)));
            }
        }
    }

    public static void main(String[] args) {

        email("my@yahoo.com;  your@gmail.com;  his@mail.ru;  they.profi.builders@gmail.com   her...glasses..@yahoo.com");

    }
}

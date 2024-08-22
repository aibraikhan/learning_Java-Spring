package Lesson3;

public class thirdLesson {
    public static void main(String[] args) {
        thirdLesson lesson = new thirdLesson();
        lesson.firstTask();
        lesson.secondTask();

    }
    public void firstTask(){
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;

        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);
        result = 0;
        result = i2 / d1;
        result += d2;
        result %= i1;
        result -= l;
        System.out.println(result);
    }

    public void secondTask() {
        byte a = 5;
        int b = a-- - --a + ++a + a++ + a; // 5-3+4+4+5=15
        System.out.println(b);
        b = 8;
        int c = ++b - b++ + ++b - --b; //9-9+11-10=1
        System.out.println(c);
    }
}

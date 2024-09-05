package Lesson15_While;

public class Lesson15 {

    public static void time() {
        int  hour = 0, min, sec;

        OUTER:
        while(hour < 6) {
            min = -1;

            MIDDLE:
            do {
                sec = 0;

                if (hour > 1 && min % 10 == 0)
                    break OUTER;

                min++;
                INNER:
                while (sec < 60) {
                    if ((sec * hour) > min)
                        continue MIDDLE;

                    System.out.println("Time: " + hour + ":" + min + ":" + sec);
                    sec++;
                }

            } while (min < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}

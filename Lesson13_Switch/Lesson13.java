package Lesson13_Switch;

public class Lesson13 {

    public static void howManyDays(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Wrong number, choose from 1-12");
        }
    }

    public static void main(String[] args) {
        // year 2024
        howManyDays(9);
    }
}

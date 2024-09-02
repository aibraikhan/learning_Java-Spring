package Lesson12_IfElse;

import Lesson11_PassingPrimitivesAndReferencesToMethods.Car;

public class Lesson12 {

    public static void compareWithLogicalOperators(Car c1, Car c2) {
        if ((c1.doors == c2.doors) && (c1.color.equals(c2.color)) && (c1.engine.equals(c2.engine))) {
            System.out.println("They are the same");
        } else
            System.out.println("They are not the same");
    }

    public static void compare(Car c1, Car c2) {
        if (c1.color.equals(c2.color)) {
            if (c1.engine.equals(c2.engine)) {
                if (c1.doors == c2.doors){
                    System.out.println("They are the same");
                } else
                    System.out.println("The color and engine are the same");
            } else if (c1.doors == c2.doors) {
                System.out.println("The color and doors are the same");
            } else
                System.out.println("The color is the same");
        } else if (c1.engine.equals(c2.engine)) {
            if (c1.doors == c2.doors) {
                System.out.println("The engine and doors are the same");
            } else
                System.out.println("The engine are the same");
        } else if (c1.doors == c2.doors) {
            System.out.println("The doors are the same");
        } else
            System.out.println("They are not the same");
    }



    public static void main(String[] args) {
        Car c1 = new Car("black", "V6", 4);
        Car c2 = new Car("black", "V6", 4);

        compareWithLogicalOperators(c1, c2);
        compare(c1, c2);
    }
}

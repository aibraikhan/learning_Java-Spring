package Lesson11_PassingPrimitivesAndReferencesToMethods;

public class Car {

    public String color;
    public String engine;
    public int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

}

class CarTest {
    public static void changeDoors(Car c1, int howMany) {
        c1.doors = howMany;
    }

    public static void swapColors(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("black", "V12", 2);
        Car c2 = new Car("white", "V8", 4);

        changeDoors(c2, 2);
        System.out.println(c2.doors);

        swapColors(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);
    }
}

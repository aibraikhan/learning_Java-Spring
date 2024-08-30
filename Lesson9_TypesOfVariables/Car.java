package Lesson9_TypesOfVariables;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V8");
        Car car2 = new Car("black", "V6");
        Car car3 = new Car("blue", "V12");
        Car car4 = new Car("yellow", "V8");
        Car car5 = new Car("pink", "W16");
        Car car6 = new Car("green", "V6");
        Car car7 = new Car("grey", "W16");
        Car car8 = new Car("white", "V12");

        car8 = null;
        car7 = null;
        car6 = null;
        car5 = null;
        car4 = null;
        car3 = null;
    }
}

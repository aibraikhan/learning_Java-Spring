package Lesson10_ImportAndImportStatic.p1.p2.p3;

import Lesson10_ImportAndImportStatic.p1.A;

public class C {

    public int c = 30;

    public void count() {
        A a = new A();
        int result = a.a + c;
        System.out.println("Here is the result of counting class A and C = " + result);
    }
}

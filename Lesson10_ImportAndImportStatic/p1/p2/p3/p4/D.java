package Lesson10_ImportAndImportStatic.p1.p2.p3.p4;

import Lesson10_ImportAndImportStatic.p1.*;
import static Lesson10_ImportAndImportStatic.p1.p2.B.*;
import Lesson10_ImportAndImportStatic.p1.p2.p3.*;
import Lesson10_ImportAndImportStatic.p1.p2.p3.p4.p5.*;


public class D {
    public int d = 40;

    public static void main(String[] args) {
        // class A
        A p1 = new A();
        System.out.println("This is imported from class A: " + p1.a);
        p1.show();
        System.out.println();

        // class B
        System.out.println("This is imported from class B: " + b);
        show();
        System.out.println();

        // class C
        C p3 = new C();
        System.out.println("This is imported from class C: " + p3.c);
        p3.count();
        System.out.println();

        // class E
        E p5 = new E();
        System.out.println("This is imported from class E: " + p5.e);
    }
}

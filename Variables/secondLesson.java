package Variables;

public class secondLesson {
    public static void main(String[] args) {

        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0xC;

        short s1 = 1300;
        short s2 = 0b0101_0001_0100;
        short s3 = 02424;
        short s4 = 0x514;

        int i1 = 0;
        int i2 = 0b0000;
        int i3 = 00;
        int i4 = 0x0;

        long l1 = 123_456_789L;
        long l2 = 0b0111_0101_1011_1100_1101_0001_0101L;
        long l3 = 0726_746_425L;
        long l4 = 0x75B_CD15L;

        System.out.println("Byte: \n" + b1 + "\n" + b2 + "\n" + b3 + "\n" + b4 +
                "\n\nShort: \n" + s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 +
                "\n\nInt: \n" + i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 +
                "\n\nLong: \n" + l1 + "\n" + l2 + "\n" + l3 + "\n" + l4);


        float f1 = 0.5f;
        float f2 = 1245.5346f;

        double d1 = 0.5;
        double d2 = 1245.5346;
        System.out.println("\nFloat: \n" + f1 + "\n" + f2 +
                "\n\nDouble: \n" + d1 + "\n" + d2);

        boolean bool = true;
        boolean bool2 = false;
        System.out.println("\nBoolean: \n" + bool + "\n" + bool2);

        char c1 = 'a';
        char c2 = 'B';
        char c3 = ' ';
        char c4 = '9';
        char c5 = 64;
        char c6 = '\u0064';
        System.out.println("\nChar: \n" + c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 +
                "\n" + c5 + "\n" + c6);

    }
}

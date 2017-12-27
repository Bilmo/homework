package ex1;

public class Tabl {
    public static void main(String[] args) {
        System.out.println(transformFromByteToShort((byte) 11, (short) 22));
        System.out.println(transformFromByteToChar((byte) 89, (char) 56));
        System.out.println(transformFromByteToInt((byte) 33, 77));
        System.out.println(transformFromByteToLong((byte) 44, 88));
        System.out.println(transformFromByteToFloat((byte) 789, 56.9f));
        System.out.println(transformFromByteToDouble((byte) 4895, 4786));
        System.out.println(transformFromShortToByte((short) 55, (byte) 99));
        System.out.println(transformFromShortToChar((short) 456, (char) 789));
        System.out.println(transformFromShortToInt((short) 66, 100));
        System.out.println(transformFromShortToLong((short) 469, 489));
        System.out.println(transformFromShortToFloat((short) 7954, 654.9f));
        System.out.println(transformFromShortToDouble((short) 45697, 46647));
        System.out.println(transformFromCharToByte((char) 7995, (byte) 6656));
        System.out.println(transformFromCharToShort((char) 54545, (short) 568));
        System.out.println(transformFromCharToInt((char) 7989, 4964));
        System.out.println(transformFromCharToLong((char) 9664, 4561));
        System.out.println(transformFromCharToFloat((char) 4648, 89.56f));
        System.out.println(transformFromCharToDouble((char) 1588, 8999));
        System.out.println(transformFromIntToByte((int) 15, (byte) 48));
        System.out.println(transformFromIntToShort((int) 896, (short) 899));
        System.out.println(transformFromIntToChar((int) 77, (char) 88));
        System.out.println(transformFromIntToLong((int) 7777, 8888));
        System.out.println(transformFromIntToFloat((int) 566, 58.9f));
        System.out.println(transformFromIntToDouble((int) 4589, 5545));
        System.out.println(transformFromLongToByte((long) 45668, (byte) 789));
        System.out.println(transformFromLongToShort((long) 8964, (short) 664));
        System.out.println(transformFromLongToChar((long) 2361, (char) 5899));
        System.out.println(transformFromLongToInt((long) 1236, (int) 999));
        System.out.println(transformFromLongToFloat((long) 7789, 5631f));
        System.out.println(transformFromLongToDouble((long) 6541, 3266));
        System.out.println(transformFromFloatToByte((float) 46.21f, (byte) 88));
        System.out.println(transformFromFloatToShort((float) 489.97f, (short) 7896));
        System.out.println(transformFromFloatToChar((float) 78.96f, (char) 4569));
        System.out.println(transformFromFloatToInt((float) 256.8f, (int) 7896));
        System.out.println(transformFromFloatToLong((float) 86.98f, (long) 2365));
        System.out.println(transformFromFloatToDouble((float) 458.9f, 9963));
        System.out.println(transformFromDoubleToByte((double) 78.88, (byte) 556));
        System.out.println(transformFromDoubleToShort((double) 56.123, (short) 136));
        System.out.println(transformFromDoubleToChar((double) 236.8, (char) 1269));
        System.out.println(transformFromDoubleToInt((double) 569.4, (int) 469));
        System.out.println(transformFromDoubleToLong((double) 777.777, (long) 45666));
        System.out.println(transformFromDoubleToFloat((double) 89.456, (float) 45.78f));
    }

    public static short transformFromByteToShort(byte b, short s) {
        s = b;
        return s;
    }

    public static char transformFromByteToChar(byte b4, char c1) {
        c1 = (char) b4;
        return (char) b4;
    }

    private static int transformFromByteToInt(byte b1, int i1) {
        i1 = b1;
        return i1;
    }

    public static long transformFromByteToLong(byte b2, long l1) {
        l1 = b2;
        return l1;
    }

    public static float transformFromByteToFloat(byte b4, float f) {
        f = (float) b4;
        return f;
    }

    public static double transformFromByteToDouble(byte b5, double d) {
        d = (double) b5;
        return d;
    }

    public static short transformFromShortToByte(short s1, byte b3) {
        b3 = (byte) s1;
        return b3;
    }

    public static char transformFromShortToChar(short s3, char c2) {
        c2 = (char) s3;
        return c2;
    }

    public static int transformFromShortToInt(short s2, int i2) {
        i2 = s2;
        return i2;
    }

    public static long transformFromShortToLong(short s3, long l2) {
        l2 = s3;
        return l2;
    }

    public static float transformFromShortToFloat(short s4, float f1) {
        f1 = (float) s4;
        return f1;
    }

    public static double transformFromShortToDouble(short s5, double d1) {
        d1 = (double) s5;
        return d1;
    }

    public static byte transformFromCharToByte(char c3, byte b7) {
        b7 = (byte) c3;
        return b7;
    }

    public static short transformFromCharToShort(char c4, short s6) {
        s6 = (short) c4;
        return s6;
    }

    public static int transformFromCharToInt(char c5, int i3) {
        i3 = c5;
        return i3;
    }

    public static long transformFromCharToLong(char c6, long l3) {
        l3 = c6;
        return l3;
    }

    public static float transformFromCharToFloat(char c7, float f2) {
        f2 = c7;
        return f2;
    }

    public static double transformFromCharToDouble(char c8, double d2) {
        d2 = c8;
        return d2;
    }

    public static byte transformFromIntToByte(int i7, byte b8) {
        b8 = (byte) i7;
        return b8;
    }

    public static short transformFromIntToShort(int i8, short s9) {
        s9 = (short) i8;
        return s9;
    }

    public static char transformFromIntToChar(int i9, char c8) {
        c8 = (char) i9;
        return c8;
    }

    public static long transformFromIntToLong(int i10, long l4) {
        l4 = i10;
        return l4;
    }

    public static float transformFromIntToFloat(int i13, float f12) {
        f12 = i13;
        return f12;
    }

    public static double transformFromIntToDouble(int i11, double d6) {
        d6 = i11;
        return d6;
    }

    public static byte transformFromLongToByte(long l13, byte b14) {
        b14 = (byte) l13;
        return b14;
    }

    public static short transformFromLongToShort(long l15, short s16) {
        s16 = (short) l15;
        return s16;
    }

    public static char transformFromLongToChar(long l16, char c19) {
        c19 = (char) l16;
        return c19;
    }

    public static int transformFromLongToInt(long l17, int i18) {
        i18 = (int) l17;
        return i18;
    }

    public static float transformFromLongToFloat(long l19, float f16) {
        f16 = l19;
        return f16;
    }

    public static double transformFromLongToDouble(long l14, double d10) {
        d10 = l14;
        return d10;
    }

    public static byte transformFromFloatToByte(float f19, byte b12) {
        b12 = (byte) f19;
        return b12;
    }

    public static short transformFromFloatToShort(float f12, short s12) {
        s12 = (short) f12;
        return s12;
    }

    public static char transformFromFloatToChar(float f15, char c16) {
        c16 = (char) f15;
        return c16;
    }

    public static int transformFromFloatToInt(float f22, int i33) {
        i33 = (int) f22;
        return i33;
    }

    public static long transformFromFloatToLong(float f44, long l33) {
        l33 = (long) f44;
        return l33;
    }

    public static double transformFromFloatToDouble(float f55, double d88) {
        d88 = f55;
        return d88;
    }

    public static byte transformFromDoubleToByte(double d11, byte b16) {
        b16 = (byte) d11;
        return b16;
    }

    public static short transformFromDoubleToShort(double d13, short s19) {
        s19 = (short) d13;
        return s19;
    }

    public static char transformFromDoubleToChar(double d15, char c76) {
        c76 = (char) d15;
        return c76;
    }

    public static int transformFromDoubleToInt(double d19, int i56) {
        i56 = (int) d19;
        return i56;
    }

    public static long transformFromDoubleToLong(double d33, long l54) {
        l54 = (long) d33;
        return l54;
    }

    public static float transformFromDoubleToFloat(double d55, float f44) {
        f44 = (float) d55;
        return f44;
    }
}

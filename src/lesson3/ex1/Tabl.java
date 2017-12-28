package lesson3.ex1;

public class Tabl {
    public static void main(String[] args) {
        System.out.println(transformFromByteToShort((byte) 15));
        System.out.println(transformFromByteToInt((byte) 45));
        System.out.println(transformFromByteToChar((byte) 79));
        System.out.println(transformFromByteToLong((byte) 36));
        System.out.println(tranformFromByteToFloat((byte) 14));
        System.out.println(transformFromByteToDouble((byte) 16));
        System.out.println(transformFromShortToByte((short) 54));
        System.out.println(tranformFromShortToChar((short) 122));
        System.out.println(transformFromShortToInt((short) 124));
        System.out.println(transformFromShortToLong((short) 155));
        System.out.println(transformFromShortToFloat((short) 126));
        System.out.println(transformFromShortToDouble((short) 44));
        System.out.println(transformFromCharToByte((char) 144));
        System.out.println(transformFromCharToShort((char) 111));
        System.out.println(transformFromCharToInt((char) 12));
        System.out.println(transformFromCharToLong((char) 116));
        System.out.println(transformFromCharToFloat((char) 87));
        System.out.println(transformFromCharToDouble((char) 54));
        System.out.println(transformFromIntToByte(1111));
        System.out.println(transformFromIntToShort(123));
        System.out.println(transformFromIntToChar(112));
        System.out.println(transformFromIntToLong(122));
        System.out.println(transformFromIntToFloat(115));
        System.out.println(transformFromIntToDouble(3355));
        System.out.println(transformFromLongToByte((long) 122));
        System.out.println(transformFromLongToShort((long) 544));
        System.out.println(transformFromLongToChar((long) 615));
        System.out.println(transformFromLongToInt((long) 977));
        System.out.println(transformFromLongToFloat(112));
        System.out.println(transformFromLongToDouble(511));
        System.out.println(transformFromFloatToByte(122.44f));
        System.out.println(transformFromFloatToShort(666.22f));
        System.out.println(transformFromFloatToChar(12.66f));
        System.out.println(transformFromFloatToInt(885.11f));
        System.out.println(transformFromFloatToLong(122.55f));
        System.out.println(transformFromFloatToDouble(67.12f));
        System.out.println(transformFromDoubleToByte(11.55));
        System.out.println(transformFromDoubleToShort(12.11));
        System.out.println(transformFromDoubleToChar(122.55));
        System.out.println(transformFromDoubleToInt(224.15));
        System.out.println(transformFromDoubleToLong(766.12));
        System.out.println(transformFromDoubleToFloat(166.12));
    }

    public static short transformFromByteToShort(byte b) {
        return b;
    }

    public static char transformFromByteToChar(byte b1) {
        return (char) b1;
    }

    public static int transformFromByteToInt(byte b2) {
        return b2;
    }

    public static long transformFromByteToLong(byte b3) {
        return b3;
    }

    public static float tranformFromByteToFloat(byte b4) {
        return b4;
    }

    public static double transformFromByteToDouble(byte b5) {
        return b5;
    }

    public static byte transformFromShortToByte(short s1) {
        return (byte) s1;
    }

    public static char tranformFromShortToChar(short s2) {
        return (char) s2;
    }

    public static int transformFromShortToInt(short s2) {
        return s2;
    }

    public static long transformFromShortToLong(short s3) {
        return s3;
    }

    public static float transformFromShortToFloat(short s4) {
        return (float) s4;
    }

    public static double transformFromShortToDouble(short s5) {
        return (double) s5;
    }

    public static byte transformFromCharToByte(char c3) {
        return (byte) c3;
    }

    public static short transformFromCharToShort(char c1) {
        return (short) c1;
    }

    public static int transformFromCharToInt(char c1) {
        return c1;
    }

    public static long transformFromCharToLong(char c1) {
        return c1;
    }

    public static float transformFromCharToFloat(char c1) {
        return c1;
    }

    public static double transformFromCharToDouble(char c1) {
        return c1;
    }

    public static byte transformFromIntToByte(int i1) {
        return (byte) i1;
    }

    public static short transformFromIntToShort(int i1) {
        return (short) i1;
    }

    public static char transformFromIntToChar(int i1) {
        return (char) i1;
    }

    public static long transformFromIntToLong(int i1) {
        return i1;
    }

    public static float transformFromIntToFloat(int i1) {
        return i1;
    }

    public static double transformFromIntToDouble(int i1) {
        return i1;
    }

    public static byte transformFromLongToByte(long l1) {
        return (byte) l1;
    }

    public static short transformFromLongToShort(long l1) {
        return (short) l1;
    }

    public static char transformFromLongToChar(long l1) {
        return (char) l1;
    }

    public static int transformFromLongToInt(long l1) {
        return (int) l1;
    }

    public static float transformFromLongToFloat(long l1) {
        return l1;
    }

    public static double transformFromLongToDouble(long l1) {
        return l1;
    }

    public static byte transformFromFloatToByte(float f1) {
        return (byte) f1;
    }

    public static short transformFromFloatToShort(float f1) {
        return (short) f1;
    }

    public static char transformFromFloatToChar(float f1) {
        return (char) f1;
    }

    public static int transformFromFloatToInt(float f1) {
        return (int) f1;
    }

    public static long transformFromFloatToLong(float f1) {
        return (long) f1;
    }

    public static double transformFromFloatToDouble(float f1) {
        return f1;
    }

    public static byte transformFromDoubleToByte(double d1) {
        return (byte) d1;
    }

    public static short transformFromDoubleToShort(double d1) {
        return (short) d1;
    }

    public static char transformFromDoubleToChar(double d1) {
        return (char) d1;
    }

    public static int transformFromDoubleToInt(double d1) {
        return (int) d1;
    }

    public static long transformFromDoubleToLong(double d1) {
        return (long) d1;
    }

    public static float transformFromDoubleToFloat(double d1) {
        return (float) d1;
    }
}
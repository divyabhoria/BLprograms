class J152 {
    public static void main(String[] args) {
        int num = 100;
        long longNum = num;
        float floatNum = longNum;
        double doubleNum = floatNum;

        System.out.println("Widening (Broadening):");
        System.out.println("int: " + num);
        System.out.println("long: " + longNum);
        System.out.println("float: " + floatNum);
        System.out.println("double: " + doubleNum);

        double d = 123.456;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("\nNarrowing:");
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
    }
}

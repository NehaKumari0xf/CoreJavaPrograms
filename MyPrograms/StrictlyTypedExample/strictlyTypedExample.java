public class StrictlyTypedExample{
    public static void main(String args[]) {
        byte a;// -128 to 127
        a = 10;
        System.out.print(a);
        System.out.print("\n");
        a = -128;
        System.out.print(a);
        System.out.print("\n");
        a = 127;
        System.out.print(a);
        System.out.print("\n");
        /*
         * a = -129;
         * System.out.print(a);
         */
        /*
         * a = 128;
         * System.out.print(a);
         */
        a = 10;
        /*
         * a = a + 1;//errror bcz 1 is int type of data which id 
         * greater than byte size storage capacity
         * System.out.print(a);
         */
        a = (byte) (a + 1);
        System.out.println(a);
        a++;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a += 200;
        System.out.print(a);

    }
}

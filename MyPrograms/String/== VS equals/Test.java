public class Test {
    public static void main(String...args)
    {
        Fraction f1=new Fraction();
        Fraction f2=new Fraction(21,7);
        Fraction f3=new Fraction(6,-5);
        Fraction f4=new Fraction(42,14);
        Fraction f5=f1; //f5 is refering to objec f1, i.e. f1 and f5 is refering to same object
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("f3="+f3);
        System.out.println("f4="+f4);
        System.out.println("f5="+f5);

        //Compare two fractions
        //1. Object is same or not (== operator compares references)
        if(f1==f2)
        System.out.println("f1 and f2 is refering to same object");
        else
        System.out.println("f1 and f2 is refering to different object");

        if(f1==f5)
        System.out.println("f1 and f5 is refering to same object");
        else
        System.out.println("f1 and f5 is refering to different object");

        //2. Comparing Content of Two object
        //equals() should be used for comparing content of two object
        //every class has equals()
        if(f2.equals(f4))
        System.out.print("f2="+f2+", f4="+f4+", both object have same content");
        else
        System.out.print("f2="+f2+", f4="+f4+", both object have different content");

        if(f2==f4)
        System.out.println("Both are same object");
        else
        System.out.println("Both are different object");
    }
}
//String Comparision
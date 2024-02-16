public class ObjOfPerson{
    public static void main(String args[])
    {
        //obj creation of 15 persons
        Person p1=new Person("Nusrat", "F", 19,123456789 );
        Person p2=new Person("Payal", "F", 19,123456789 );
        Person p3=new Person("Jyoti", "F", 19,123456789 );
        Person p4=new Person("Riya", "F", 19,123456789 );
        Person p5=new Person("Ankita", "F", 19,123456789 );
        Person p6=new Person("Rakhi", "F", 19,123456789 );
        Person p7=new Person("Shreya", "F", 19,123456789 );
        Person p8=new Person("Abhishek", "M", 19,123456789 );
        Person p9=new Person("Utkarsh", "M", 19,123456789 );
        Person p10=new Person("Anmol", "F", 19,123456789 );
        Person p11=new Person("Sejal", "F", 19,123456789 );
        Person p12=new Person("Priyanshi", "F", 19,123456789);
        Person p13=new Person("Srishti", "F", 19,123456789 );
        Person p14=new Person("Insha", "F", 19,123456789 );
        Person p15=new Person("Farah", "F", 19,123456789 );

        //display info by using show function
        System.out.println("\n-------------------Person Details----------------------------");
        System.out.println("\tName\t "+"Gender\t "+"\tAge\t "+" Contact no");
        System.out.println("--------------------------------------------------------------");

        p1.show();
        p2.show();
        p3.show();
        p4.show();
        p5.show();
        p6.show();
        p7.show();
        p8.show();
        p9.show();
        p10.show();
        p11.show();
        p12.show();
        p13.show();
        p14.show();
        p15.show();




    }
}
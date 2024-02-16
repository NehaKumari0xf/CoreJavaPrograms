public class Test {
    public static void main(String...args)
    {
        Person p=new Person("Anshu Mala");
        Male rahul=new Male("Rahul Kumar");
        Female kajal=new Female("Kajal Kumari");
        p.mySelf();
        rahul.mySelf();
        kajal.mySelf();

        //Assigning sub class object to super class reference and calling overriden method
        //Accessing Runtime Ploymorphism/Late Binding/Dynamic Binding
        Person person;
        //assigning Person class object to person
        System.out.println("============================");
        person=p;
        person.mySelf();
        //Assigning Male class object to person
        person=rahul;
        person.mySelf();
        //Assigning Female class object to person
        person=kajal;
        person.mySelf();

        
        
    }
    
}
/*
 * Java's every class Inherits Object class.
 * Object is the super class of all classes in Java.
 * Object is the top class of Java class hierarchy
 */

public class Test {
    public static void main(String...args)
    {
        Person p=new Person("Anshu Mala",'F');
        Student s=new Student("Rahul Kumar",'M',"BCA",34,'b');

        p.show();
        s.show();

        Person person;
        person=p;//Person class object is assigned to Person reference
        person.show();
        person=s;//Valid: Student class object is assigned to Person Reference
        person.show();


    }
    
}

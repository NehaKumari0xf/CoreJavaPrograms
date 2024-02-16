public class Example {
    public static void main(String...args)
    {
        Person p1=new Person();
        p1.showPerson();
        Person p2=new Person("Neha Kumari");
        p2.showPerson();
        Person p3=new Person(20);
        p3.showPerson();
        Person p4=new Person("Kajal Kumari",18);
        p4.showPerson();

        Student s1=new Student();
        s1.showStudent();

        Student s2=new Student("Rahul Kumar");
        s2.showStudent();

        Student s3=new Student("Manish kumar",19);
        s3.showStudent();

        Student s4=new Student("Anshu Mala",18,12,89,'f');
        s4.showStudent();
        

    }
}

public class Person
{
    private String name;
    private int age;
    //default constructor
    public Person()
    {
        name="No Name";
        age=0;
        System.out.println("Person's Object is created using default constructor");
    }
    //parameterized constructor
    public Person(String name)
    {
        this.name=name;
        age=0;
    }
    public Person(int age)
    {
        name="No Name";
        this.age=age;
    }
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }


}

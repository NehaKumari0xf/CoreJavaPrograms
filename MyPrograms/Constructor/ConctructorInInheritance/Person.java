public class Person
{
    private String name;
    private int age;
    public Person()
    {
        name="Noname";
        age=0;
    }
    public Person(String name)
    {
        this.name=name;
        age=0;
    }
    public Person(int age)
    {
        this.name="Noname";
        this.age=Math.abs(age);
    }
    public Person(String name,int age)
    {
        this.name=name;
        this.age=Math.abs(age);
    }
    public void showPerson()
    {
        System.out.println("Name="+name+", Age="+age);
    }

}
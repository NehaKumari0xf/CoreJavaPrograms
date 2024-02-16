/*
    WAJP in which create a clss  to represent a person that will contain
    name, gender, age and contact no.
 */

public class Person{
    private String name;
    private String gender;
    private int age;
    private int contactNo;

    public Person()
    {
        name="No Name";
        gender="No Gender";
        age=0;
        contactNo=0;
    }

    public Person(String name, String gender, int age, int contactNo)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contactNo = contactNo;
    }

    public void show()
    {
        System.out.printf("%15s\t %2s\t\t %2d\t %10d\n",name,gender,age,contactNo);
    }
}
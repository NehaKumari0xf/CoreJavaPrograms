public class Student extends Person {
    private int clas;
    private int marks;
    private char gender;
    public Student()
    {//whenever it will be called, it will call default constructor of Person
        clas=0;
        marks=0;
        gender='x';
    }
    public Student(String name)
    {
       super(name);//it will call the super class constructor having one string argument
        //This statement must be 1st statement of any constructor
       clas=0;
       marks=0;
       gender='x'; 
    }
    public Student(String name,int age )
    {
        super(name,age);
        clas=0;
        marks=0;
        gender='x';
    }
    public Student(String name,int age,int clas,int marks,char gender)
    {
        super(name,age);
        this.clas=Math.abs(clas);
        this.marks=Math.abs(marks);
        if(gender=='m'||gender=='M')
        this.gender='M';
        else if(gender=='f'||gender=='F')
        this.gender='F';
        else
        this.gender='X';
    }
    public void showStudent()
    {
        System.out.println("=============================");
        showPerson();
        System.out.println("Class:"+clas+", Marks:"+marks+", Gender:"+gender);
        System.out.println("==============================");
    }
}
//Method Overriding

public class Student extends Person{
    private String clas;
    private int roll;
    private char section;
    public Student()
    {
        //It will automatically call the supar class default constructor
        clas="X";
        roll=0;
        section='X';
    }
    public Student(String name,char gender,String clas,int roll,char section)
    {
        super(name,gender);
        this.clas=clas;
        this.roll=roll;
        this.section=section;
    }
    //Override show method
    @Override  //Annotation
    public void show()
    {
        System.out.println("\nStudent: Name:"+name+", Gender="+gender+", Class="+clas+", Section="+section+", Roll="+roll);
    }
}

class Person
{
    protected String name;
    protected char gender;
    public Person()
    {
        name="Noname";
        gender='X';
    }
    public Person(String name,char gender)
    {
        this.name=name;
        if(gender=='M'||gender=='m')
        this.gender='M';
        else if(gender=='f'||gender=='F')
        this.gender='F';
        else
        this.gender='X';
    }
    public void show()
    {
        System.out.println("\nPerson: Name:"+name+", Gender:"+gender);
        
    }
}
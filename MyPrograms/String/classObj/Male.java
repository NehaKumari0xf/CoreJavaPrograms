public class Male extends Person {
    private char gender;
    public Male()
    {
        gender='M';
    }
    public Male(String name)
    {
        super(name);
        gender='M';
    }
    @Override
    public void mySelf()
    {
        System.out.println("I am "+name+". I am Male");
    }    
}

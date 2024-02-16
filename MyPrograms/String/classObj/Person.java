public class Female extends Person {
    private char gender;
    public Female()
    {
        gender='f';
    }
    public Female(String name)
    {
        super(name);
        gender='f';
    }
    @Override
    public void mySelf()
    {
        System.out.println("My self Miss/Mrs. "+name);
    }   

}

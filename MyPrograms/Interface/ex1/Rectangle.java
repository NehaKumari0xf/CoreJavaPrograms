public class Rectangle implements Area{
    private double l,b;
    public Rectangle()
    {
        l=0;
        b=0;
    }
    public Rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    public void setSides(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    public double getArea()
    {
        return l*b;
    }  
    @Override
    public String getName()
    {
        return "Rectangle";
    }  
}

public class Triangle implements Area{
    private double s1,s2,s3;
    public Triangle()
    {

        s1=s2=s3=0;
    }
    public Triangle(double s1,double s2,double s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    @Override
    public double getArea()
    {
        double s=s1+s2+s3;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    @Override
    public String getName()
    {
        return "Triangle";
    }

    
}

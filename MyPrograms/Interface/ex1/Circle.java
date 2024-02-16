public class Circle implements Area {
    private double radius;
    public Circle()
    {
        radius=0;
    }
    public Circle(double r)
    {
        radius=r;
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getRadius()
    {
        return radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public String getName()
    {
        return "Circle";
    }
 
}

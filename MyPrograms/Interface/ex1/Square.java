public class Square implements Area {
    private double side;
    public Square()
    {
        side=0;
    }
    public Square(double side)
    {
        this.side=side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
    public double getSide()
    {
        return side;
    }
    @Override
    public double getArea()
    {
        return side*side;
    }
    @Override
    public String getName()
    {
        return "Square";
    }
}

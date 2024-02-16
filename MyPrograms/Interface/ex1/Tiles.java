public class Tiles {
    private double price;
    public Tiles()
    {
        price=0;
    }
    public Tiles(double price)
    {
        this.price=price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public void calculatePrice(double area)
    {
        System.out.println("Object Not Specified:Total Amount="+(area*price));
    }
    public void calculatePrice(Area a)
    {
        System.out.println(a.getName()+":Total Amount="+(a.getArea()*price));
    }
    
}

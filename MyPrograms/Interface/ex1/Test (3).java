public class Test {
    public static void main(String...args)
    {
        Circle c=new Circle(9.7);
        Rectangle r=new Rectangle(6,7);
        Square s=new Square(15);

        Tiles t1=new Tiles(89.67);
        Tiles t2=new Tiles(102.7);

        t1.calculatePrice(c.getArea());
        t1.calculatePrice(r.getArea());
        t1.calculatePrice(s.getArea());

        t2.calculatePrice(s);
        t2.calculatePrice(r);
        t2.calculatePrice(c);

        Triangle tri1=new Triangle(4,4,4);
        t2.calculatePrice(tri1);


    }
    
}

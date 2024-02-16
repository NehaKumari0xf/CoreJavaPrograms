public class Fraction
{
    private int num;
    private int dnum;
    public Fraction()
    {
        num=0;
        dnum=1;
    }
    public Fraction(int num,int dnum)
    {
        if(dnum==0)dnum=1;
        if(dnum<0)
        {
            num*=-1;
            dnum*=-1;
        }
        this.num=num;
        this.dnum=dnum;
    }
    public void show()
    {
        System.out.print(num+"/"+dnum);
    }
    @Override
    public String toString()
    {
        return num+"/"+dnum;
    }

    //overide equals()
    @Override
    public boolean equals(Object obj)
    {
        Fraction ob=(Fraction)obj;
        if(num*ob.dnum==ob.num*dnum)
        return true;
        else
        return false;
    }
}
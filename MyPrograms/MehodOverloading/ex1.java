public public class ex1
{
public static void main(String []args)
{
System.out.println("Larger of 5 and 7 is :"+larger(5,7));
System.out.println("Larger of 45,67 and 98 is:"+larger(45,67,98));
System.out.println("Larger of 10,50,20 and 30 is:"+larger(10,50,20,30));
System.out.println("Largest of :"+newLarger());
System.out.println("Larger of 7 is:"+newLarger(7));
System.out.println("Larger if 3 and 5 is:"+newLarger(3,5));
System.out.println("Larger of 45,67 and 98 is:"+newLarger(45,67,98));
System.out.println("Larger of 10,30,20,21,89,56,34 and 11 is:"+newLarger(10,30,20,21,89,56,34,11));
}
private static int larger(int x,int y)
{
 if(x>y)
 return x;
 else
 return y;   
}
private static int larger(int a,int b,int c)
{
    if(a>b&&a>c)return a;
    else if(b>c)return b;
    else return c;
}
private static int larger(int a,int b,int c,int d)
{
    if(a>b&&a>c&&a>d)return a;
    else if(b>c&&b>d)return b;
    else if(c>d)return c;
    else return d;
}

//Variable length argument function
//function with variable length argument
private static int newLarger(int...nums)
{
 //here nums is array 
 if(nums.length==0)return 0;
 int s=nums[0];//let the 1st element of array is largest
 for(int n : nums)
{
    if(n>s)s=n;
}
return s;
}
} 
    

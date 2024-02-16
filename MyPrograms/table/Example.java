public class Example
{
    public static void main(String ...args)
    {
        System.out.println("Average of 10 and 20 is :"+avg(10,20));
        System.out.println("Average of 11,12,13 and 14 is:"+avg(11,12,13,14));
        System.out.println("Average of 1,2,3,4,5,6,7,8,9 and 10 is:"+avg(1,2,3,4,5,6,7,8,9,10));
        display("Anshu Mala", 10);
        display("Kajal Kumari",67,90);
        display("Manish Kumar",120,90,56,78,98);
    }
    //function with variable length argument
    private static double avg(double...nums)
    {
        double sum=0;
        if(nums.length==0)return 0;
        for(double num:nums)sum+=num;
        return sum/nums.length;
    }
    //A function may have normal argument and variable length argument. variable length argument must be last argument
    private static void display(String name,int roll,int...marks)
    {
        System.out.print("\nName:"+name);
        System.out.println("\nRoll:"+roll);
        int total=0;
        int i=1;
        for(int m:marks)
        {
            System.out.println("Marks "+i+":"+m);
            i++;
            total+=m;
        }
        System.out.printf("Total="+total);
    }
} 
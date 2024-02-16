import java.util.Scanner;
public class Table
{
    public static void main(String...args)
    {
        Scanner kb=new Scanner(System.in);
        int n;
        //input number
        //accept number from command line
        if(args.length>0)
        {
            n=Integer.parseInt(args[0]);
        }
        else
        {
        System.out.print("Enter any number:");
        n=kb.nextInt();
        }
        //print table
        System.out.println("Table of "+n+":");
        for(int i=1;i<=10;i++)
        System.out.printf("\n%3d * %2d = %5d",n,i,n*i);

        System.out.println("\nThank You");


    }
}
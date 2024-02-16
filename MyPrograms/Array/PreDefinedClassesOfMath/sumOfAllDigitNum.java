import java.util.Scanner;
public class sumOfAllDigitNum{
    public static void main(String ar[])
    {
        int sum=0, rem, num;
        System.out.println("Write a java program that will accept a number and print the sum of all digit of number");
        Scanner ref=new Scanner(System.in);
        System.out.print("\nEnter any number: ");
        num=ref.nextInt();

        while(num>0)
        {
            rem=num%10;
            sum+=rem;
            num=num/10;   
        }System.out.print("Sum of all digits is: "+sum);
    }
}
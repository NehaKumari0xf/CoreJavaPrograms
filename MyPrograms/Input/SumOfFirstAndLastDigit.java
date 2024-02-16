import java.util.Scanner;
public class SumOfFirstAndLastDigit {
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any 4 digit numbers : ");
        int num=sc.nextInt();

        if(num>=1000&&num<=9999)
        {
            int fdigit=num/1000;
            int ldigit=num%10;
            int sum=fdigit+ldigit;
            System.out.printf("Sum of 1st and last digit is : %d ",sum);
        }else
        System.out.print("Invalid 4 digit numbers.");
    }
}

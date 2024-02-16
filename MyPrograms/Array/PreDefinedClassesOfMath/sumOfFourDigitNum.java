import java.util.Scanner;

public class sumOfFourDigitNum {
    public static void main(String args[])
    {
        int sum=0, rem, num;
        System.out.println("Write a java program that will accept a 4 digit number and print the sum of all 4 digit number");
        Scanner ref=new Scanner(System.in);
        System.out.print("\nEnter any 4 digit number: ");
        num=ref.nextInt();

        if(num<1000 || num>9999){
            System.out.println("Please enter valid 4 digit no.");
        }else{   
        while(num>0)
        {
            rem=num%10;
            sum+=rem;
            num/=10;   
        }System.out.print("Sum of all digits is: "+sum);
        }
    }
}
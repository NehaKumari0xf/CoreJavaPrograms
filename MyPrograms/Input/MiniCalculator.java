/*Mini calculator */
import java.util.Scanner;
class MiniCalculator
{
    public static void main(String arr[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int  num1, num2,result=0;
        
        do {
        System.out.print("\n\n\tMINI CALCULATOR");
        System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplication");
        System.out.printf("\n4. Divison\n5. Percentage\n6 Exit.");
        System.out.print("\nEnter your choice(1 to 6):-\n");
        choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("Enter first number: ");
                num1=sc.nextInt();
                System.out.printf("Enter second number: ");
                num2=sc.nextInt();
                result=num1+num2;
                System.out.printf("Addition of two numbers are = %d",result);            
            break;
            case 2:
                System.out.printf("Enter first number: ");
                num1=sc.nextInt();
                System.out.printf("Enter second number: ");
                num2=sc.nextInt();
                result=num1-num2;
                System.out.printf("Subtraction of two numbers are = %d",result);            
            break;
            case 3:
                System.out.printf("Enter first number: ");
                num1=sc.nextInt();
                System.out.printf("Enter second number: ");
                num2=sc.nextInt();
                result=num1*num2;
                System.out.printf("Multiplication of two numbers are = %d",result);            
            break;
            case 4:
                System.out.printf("Enter first number: ");
                num1=sc.nextInt();
                System.out.printf("Enter second number: ");
                num2=sc.nextInt();
                result=num1-num2;
                System.out.printf("Subtraction of two numbers are = %d",result);            
            break;
            case 5:
                System.out.printf("Enter first number: ");
                num1=sc.nextInt();
                System.out.printf("Enter second number: ");
                num2=sc.nextInt();
                result=num2/num1;
                System.out.printf("Division of two numbers are = %d",result);            
            break;
            case 6:
                System.out.print("\nExit.");
            break;    
            default:
                System.out.print("\nPlease enter valid choice.");
            break;
        
        }
    }while(choice!=7);
} 
}
import java.util.InputMismatchException;
import java.util.Scanner;
public class tryCatch
{
    public static void main(String...args)
    {
        Scanner kb=new Scanner(System.in);
        int i,j,k;
        System.out.print("Enter 1st number:");
        try{
        i=kb.nextInt();
        }catch(InputMismatchException ex)
        {
            System.out.println("Please Enter only digit");
            System.out.print("Enter 1st number:");
            kb.nextLine();
            i=kb.nextInt();
        }
        System.out.print("enter 2nd number:");
        j=kb.nextInt();
        try{
        k=i/j;
        }catch(ArithmeticException ex)
        {
            k=0;
        }

        System.out.print("Quotent="+k);
        
    }
}
/*
 * try
 * {
 * statement1;
 * statement2;
 * statement3;
 * .
 * .
 * .
 * statementN;
 * }catch(ExceptionType1 ex)
 * {
 *  code to handle Exception type1
 * }
 * catch(ExceptioType2 ex)
 * {
 *  code to handle exception type 2
 * }
 * ctach(ExceptionTypeN ex)
 * {
 *  code to hndle exception type N
 * }
 * 
 * 
 */
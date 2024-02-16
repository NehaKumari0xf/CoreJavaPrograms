/* JAva PRogram to accept an integer data from user and print it on screen*/
import java.util.Scanner;
class InputNumber
{
public static void main(String args[])
{
//create an Scanner Object
Scanner kb;
kb=new Scanner(System.in);
int i;
System.out.print("enter any number:");
i=kb.nextInt();
System.out.printf("You have entered %d",i);


}
}
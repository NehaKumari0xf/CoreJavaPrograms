
/*
 * Array In Java
 * In Java array is dynamic.
 * ----------------------------------
 * Creating Array in Java
 * 1. Create Array Reference
 * Syntax:
 * TypeOrClassName arrayRefName[];
 * or
 * TypeOrClassName[] arrayRefNAme;
 * 
 * Note [] must be empty
 * ex:
 * 
 * int arr1[]; //here arr1 is a reference of integer type array
 * float f1[],f2[];//here f1 and f2 are reference of float type array
 * String s[]; //s is a reference of String type array
 * 
 * int[] x;  //x is a reference of int type array
 * 
 * int a[],b[],c,d;// here a and b are reference of int type array and c and d are integer variable
 * 
 * int[] a,b,c[]; //here a and b are reference of int type array(1D Array) and c is a reference of 2D int array
 * 2. Create Array
 * arrayRef=new Type[size];
 * 
 * size can be integer lieral or variable
 * ex:
 * int []a;
 * a=new int[10];//here array of 10 element is created
 * 
 * int x=20;
 * String names[]=new String[x];
 * 
 * Note:On accessing element out of bound Java will generate Exception (ArrayIndexOutOfBoundException)
 *  
 */
/*Java Program that woll accept 10 numbers from user and print the smallest and largest numbers*/
import java.util.Scanner;

public class ArrayEx1{
    public static void main(String[] args) {
        int nums[] = new int[10], largest, smallest, i;
        Scanner kb = new Scanner(System.in);

        // accept dat from user
        for (i = 0; i < 10; i++) {
            System.out.printf("Enter number %d:", i + 1);
            nums[i] = kb.nextInt();
        }

        // find smallest and largest number
        smallest = largest = nums[0];
        for (i = 1; i < 10; i++) {
            if (nums[i] > largest)
                largest = nums[i];
            else if (nums[i] < smallest)
                smallest = nums[i];
        }

        // display all numbers with smallest and largest number
        System.out.print("All entered numbers are:");
        for (i = 0; i < 10; i++) {
            System.out.printf("%d, ", nums[i]);
        }
        System.out.printf("\nSmallest number is %d and largest number is %d", smallest, largest);

    }
}
/*
 * Write a Java program that will accept 15 numbers from user and print average
 * of all numbers
 * write a Java program that will accept 20 numbers and print all numbers in
 * ascending order.
 * write a Java program that will accept 30 numbers and printt all unique
 * numbers
 * write a Java program that will accept 30 numbers and print the frequency of
 * all unique numbers
 * 
 */
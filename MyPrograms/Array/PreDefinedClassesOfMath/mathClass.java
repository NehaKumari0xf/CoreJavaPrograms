import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        float num, s, sq, cube, cbRoot;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = kb.nextFloat();
        s = (float) Math.pow(num, 2);
        sq = (float) Math.sqrt(num);
        cube = (float) Math.pow(num, 3);
        cbRoot = (float) Math.pow(num, 1 / 3.0);
        System.out.printf("number = %f\n square=%f\n sqaure Root= %f\n", num, s, sq);
        System.out.printf("cube=%f\n cube root=%f", cube, cbRoot);
    }
}
/*
 * write a java program that will accept a number and print the sum of all digit
 * of number
 * 
 */
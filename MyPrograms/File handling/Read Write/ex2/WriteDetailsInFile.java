/*
 * Write a Java program that will accept name and mobile number of person and 
 * write data to file.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDetailsInFile {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.print("Enter Name:");
        String name=read.nextLine();
        System.out.print("Enter Mobile Number:");
        String mob=read.nextLine();

        try {
            FileWriter file=new FileWriter("c:\\MyJavaPrograms\\PersonDetails.txt");
            file.write("Person Details\n");
            file.write("-----------------------\n");
            file.write("Name:"+name);
            file.write("\nMobile Number:"+mob);
            file.write("\n-----------------------");
            file.close();
        } catch (Exception e) {
            System.out.print("Error:"+e.getMessage());
            System.exit(0);
        }
    }
}

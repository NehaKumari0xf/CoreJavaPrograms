//package MyPrograms.loop;

import java.util.*;

public class forEach {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("How many string you want to enter:");
        int n=sc.nextInt();
        sc.nextLine();
        
        String arr[]=new String[n];
        for(int i=0; i<n; i++)
        {
            System.out.print((i+1)+". Enter name: ");
            arr[i]=sc.nextLine();
        }
        System.out.println("----------------------------- "); 
        System.out.println("\nEntered Names are: "); 
        System.out.println("----------------------------- ");        
        for(String name: arr){
            System.out.println(name);
        }

        System.out.println("\n----------------------------- "); 
        System.out.println("Entered Names in Lower Case: ");
        System.out.println("----------------------------- ");        
        for(String name: arr){
            System.out.println(name.toLowerCase());
        }

        System.out.println("\n----------------------------- "); 
        System.out.println("Entered Names in Upper Case: ");
        System.out.println("----------------------------- ");        
        for(String name: arr){
            System.out.println(name.toUpperCase());
        }

    }
}

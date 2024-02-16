import java.util.Scanner;
class Marksheet {
    public static void main(String arr[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll, maths,hindi,sst,sci,eng, tmarks, per;
        
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your roll_no: ");
        roll=sc.nextInt();
        System.out.print("Enter your marks of maths: ");
        maths=sc.nextInt();
        System.out.print("Enter your marks of eng: ");
        eng=sc.nextInt();
        System.out.print("Enter your marks of hindi: ");
        hindi=sc.nextInt();
        System.out.print("Enter your marks of sci: ");
        sci=sc.nextInt();
        System.out.print("Enter your marks of sst: ");
        sst=sc.nextInt();

        tmarks=maths+eng+hindi+sci+sst;
        per=tmarks/5;
        
        System.out.printf("\nTotal marks: %d, percentage: %d and ",tmarks,per);
        
        if(per>=90)
        System.out.print("Grade 'A+' ");
        else if(per>=80)
        System.out.print("Grade 'A' ");
        else if(per>=70)
        System.out.print("Grade 'B' ");
        else if(per>=60)
        System.out.print("Grade 'C' ");
        else if(per>=50)
        System.out.print("Grade 'D' ");
        else if(per>=40)
        System.out.print("Grade 'F' ");
        else if(per>=30)
        System.out.print("Fail ");

    }
}

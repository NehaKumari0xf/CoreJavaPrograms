import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition
{
    public static void main(String...args)
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n1,n2,n3;
        //accept 1st value from keyboard
        //br can read only string value
        System.out.print("Enter any number:");
        String data;
        try
        {
             data=br.readLine();
        }catch(IOException ex)
        {
            //handle exception here
            data="0";
        }
        //convert data into integer
        try{
            n1=Integer.parseInt(data);
        }catch(NumberFormatException ex)
        {
            n1=0;
        }

        //accept 2nd value from keyboard
        try{
            System.out.println("Enter 2nd number:");
            data=br.readLine();
        }catch(IOException ex)
        {
            data="0";
        }
        //convert data into integer
        try{
            n2=Integer.parseInt(data);
        }catch(NumberFormatException ex)
        {
            n2=0;
        }
        n3=n1+n2;
        System.out.println(n1+" + "+n2+" = "+n3);

    }
}
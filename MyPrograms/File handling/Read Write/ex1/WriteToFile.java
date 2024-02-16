import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile
{
    public static void main(String...args)
    {
        String msg="Jai Sri Ram"; //write this messge in file
        //Create an stream that can write character data to file
        //FileWriter is a text stream 
        try{
        FileWriter file=new FileWriter("c:\\c programs\\ganesha.txt",true);
            //write data to steam
            file.write(msg);
            //close stream
            file.close();
        }catch(IOException ex)
        {
            System.out.print("Error:"+ex.getMessage());
            System.exit(0);
        }
        
        
    }
}
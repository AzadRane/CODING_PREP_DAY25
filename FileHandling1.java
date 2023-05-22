import java.io.*;
import java.util.*;


public class FileHandling1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fname = sc.nextLine();
        File ob = new File(fname);


        if(!ob.exists())
        {
            System.out.println("File not found");
            System.exit(0);
        }
        if(ob.exists())
        {
            System.out.println("Yess file exists");
           
        }

        System.out.println("File name "+ob.getName());
        System.out.println("File Path "+ob.getAbsolutePath());
        System.out.println("File size "+ob.length());
        System.out.println("Readable "+ob.canRead());
        System.out.println("Writable "+ob.canWrite());
        System.out.println("Executable "+ob.canExecute());

        sc.close();
    }
}
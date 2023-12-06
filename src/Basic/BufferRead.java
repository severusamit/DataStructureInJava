package Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.nio.Buffer;

//import java.io.*;
public class BufferRead
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        //   BufferedReader in = new BufferedReader(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
        char grade;
        int roll;
        float per;
        double marks;
        String name;

        System.out.println("enter roll no : ");
        roll =Integer.parseInt(in.readLine());
        System.out.println("enter percentage : ");
        per = Float.parseFloat(in.readLine());
        System.out.println("enter marks : ");
        marks = Double.parseDouble(in.readLine());
        System.out.println("enter name  :");
        name=in.readLine();
        System.out.println("Enter grade :");
        grade =(char)in.read();
        System.out.println("Name  : "+name);
        System.out.println("Roll  : "+roll);
        System.out.println("Marks : "+marks);
        System.out.println("Percentage : "+per);
        System.out.println("Grade :"+grade);
    }
}

package String;
import java.util.*;
class abc15
{
    String st1, st2=" ",st3=" ";
    char ch;
    int i,l;
    void getData()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String :");
        st1 =in.nextLine();
        System.out.println("String is : "+st1);
        st1=st1+ " ";
        l=st1.length();
        for(i=0;i<l;i++)
        {
            ch = st1.charAt(i);
            if(ch==' ')
            {
                st3 =st2 + " " +st3;
                st2= " ";
            }
            else
            {
                st2 =st2+ch;
            }
        }
        System.out.println("String after conversion : "+st3);
    }
}
public class StringConversion
{
    public static void main(String args[])
    {
        abc15 obj = new abc15();
        obj.getData();
    }
}

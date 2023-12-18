package InternetSourcedProblems;
import java.io.*;
import java.net.InetAddress;
public class DeviceOwnIPAddress
{
    public static void main(String args[])
    {
        try
        {
            InetAddress myIp =InetAddress.getLocalHost();
            System.out.println("My Ip Address is :");
            System.out.println(myIp.getHostAddress());
        }
        catch(Exception e)
        {
            System.out.println(" Some Error Occurred");
        }
    }

}

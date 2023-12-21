package Class;

import java.util.Scanner;

public class abc2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a ,b;
        a=in.nextInt();
        b=in.nextInt();
        aa2Product ob = new aa2Product();
        ob.get(a,b);
        ob.disp();
    }
}

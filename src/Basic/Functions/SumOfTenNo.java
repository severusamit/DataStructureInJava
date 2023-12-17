package Basic.Functions;

import java.util.Scanner;

public class SumOfTenNo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int r;
        r = sum_of_ten_no();


    }

    static int sum_of_ten_no() {
        int i, sum = 0;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter till which nth value you want to calculate ?");
        n = in.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of 1st "+ n +" number  : " + sum);
        return sum;
    }
}

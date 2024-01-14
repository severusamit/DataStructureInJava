package CodingNinjas.classesandobjects;
import java.util.*;
public class FractionUse
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Fraction f1 = new Fraction(2,3);
//        f1.print();
//        f1.setNumerator(12);
//        f1.getDenominator();
//        f1.increment();
//        f1.print();
        Fraction f2 = new Fraction(3,4);
        Fraction f3 = new Fraction(2,3);
        Fraction f4 = new Fraction(2,3);
//        f2.print();
//        f1.add(f2);
//        f1.print();
//        f1.subtract(f2);
//        f1.print();
//        f1.multiply(f2);
//        f1.print();
//        Fraction f5 = Fraction.add(f1,f2);
//        f5.print();
        int choice;
        do {
            {
                System.out.println("Menu");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Exit");
                System.out.println("Enter your choice :");

                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You have Selected Addition Option");
                        f1.add(f2);
                        f1.print();
                        break;
                    case 2:
                        System.out.println("You have selected Subtraction Option");
                        f3.subtract(f2);
                        f3.print();
                        break;
                    case 3:
                        System.out.println("You have selected Multiplication Option");
                        f4.multiply(f2);
                        f4.print();
                        break;
                    case 4:
                        System.out.println("Exiting the Program. GoodBye! ");
                        break;
                }

            }

        }while (choice != 4) ;
        in.close();


    }
}

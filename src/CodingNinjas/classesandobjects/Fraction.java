package CodingNinjas.classesandobjects;

public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    public void setNumerator(int numerator)
    {
        this.numerator=numerator;
        simplify();
    }
    public int getNumerator()
    {
        return numerator;
    }
    public void setDenominator(int denominator)
    {
        if(denominator!=0) {
            this.denominator = denominator;
            simplify();
        }
        else
        {
            System.out.println("Denominator can't be zero");
        }
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void simplify()
    {
        int gcd=1;
        int smaller=Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++)
        {
            if(numerator%i==0 && denominator%i==0)
            {
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    public void increment()
    {
        numerator=numerator+denominator;
        simplify();
    }

    public void print()
    {
        System.out.println("Fraction  : " +numerator + " /" + denominator);
    }

    public void add(Fraction f2)
    {
        //First Fraction is the fraction on which function is callsed
        //Second function is passed as arguments
        this.numerator=this.numerator * f2.denominator +this.denominator * f2.numerator;
        this.denominator=this.denominator * f2.denominator;
        simplify();
    }
    public void subtract(Fraction f2)
    {
        /*
        Suppose Fraction 1 is 2/3 and Fraction 2 is 3/4
                         2*4 - 3* 3
                       --------------
                            3 * 4
         */
        this.numerator=this.numerator *f2.denominator - this.denominator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
       // System.out.println("Denominator"+this.denominator);
        simplify();
    }
    public void multiply(Fraction f2)
    {
        this.numerator=this.numerator * f2.numerator  ;
        this.denominator=this.denominator * f2.denominator;
        simplify();
    }
    public static Fraction add(Fraction f1, Fraction f2)
    {
        int newNum = f1.numerator* f2.denominator + f1.denominator*f2.numerator;
        int newDeno =f1.denominator*f2.denominator;
        Fraction f5 = new Fraction(newNum,newDeno);
        return f5;
    }
}

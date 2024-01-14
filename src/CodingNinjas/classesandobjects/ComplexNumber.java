package CodingNinjas.classesandobjects;

public class ComplexNumber
{
    private int real;
    private int imaginary;
    
    public ComplexNumber(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public int getReal()
    {
        return real;
    }
    public void setReal(int real)
    {
        this.real =real;
    }

    public int getImaginary()
    {
        return imaginary;
    }
    public void setImaginary(int imaginary)
    {
        this.imaginary=imaginary;
    }

    public void print()
    {
        System.out.println(real + " " +imaginary);
    }
    public void add(ComplexNumber c2)
    {
        this.real +=c2.getReal();
        this.imaginary += c2.getImaginary();
    }
    public void multiply(ComplexNumber c3)
    {
        int realPart = this.real * c3.getReal() - this.imaginary * c3.getImaginary();
        int imaginaryPart = this.real * c3.getImaginary() + this.imaginary * c3.getReal();
        this.real = realPart;
        this.imaginary = imaginaryPart;

    }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
    {
        int realPart = c1.getReal() + c2.getReal();
        int imaginaryPart = c1.getImaginary() + c2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);


    }
}

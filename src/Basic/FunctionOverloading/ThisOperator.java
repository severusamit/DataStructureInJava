package Basic.FunctionOverloading;
class aa6
{
    int a=10,b;
    void get(int a)
    {

        b=this.a+a;
    }
    void put()
    {
        System.out.println("Value of b : "+b);
    }
}
public class ThisOperator
{
    public static void main(String args[])
    {
        aa6 ob = new aa6();
        ob.get(15);
        ob.put();
    }
}

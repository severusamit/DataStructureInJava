package Interface;

interface sport
{
    public int score(int s);
}
class exam
{
    int marks(int m)
    {
        return m;
    }
}
class result extends exam implements sport {
    int s,t,m;
    public int score(int s)
    {
        return s;
    }
    void get()
    {
        s=score(14);
        m=marks(67);
    }
    void put()
    {
        System.out.println("Score  : " +s);
        System.out.println("Marks  : " +m);
        t=s+m;
        System.out.println("Total Score : " +t);
    }
}
public class SportResults {
    public static void main(String args[]) {
        result obj = new result();
        obj.get();
        obj.put();
    }
}
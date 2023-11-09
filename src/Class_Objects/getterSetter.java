package Class_Objects;
class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;

    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}
public class getterSetter {
    public static void main(String args[])
    {
        MyEmployee amit = new MyEmployee();
        //  amit.id =2378;
        // amit.name="Hello how are you ?";

        amit.setName("AMIT");
        System.out.println(amit.getName());
        amit.setId(2005638);
        System.out.println(amit.getId());

    }
}

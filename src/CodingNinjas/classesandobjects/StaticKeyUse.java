package CodingNinjas.classesandobjects;

public class StaticKeyUse {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        System.out.println(StaticKey.numStudents);
        //System.out.println(Student.name);

        StaticKey s1 = new StaticKey("Manisha", 50);

        StaticKey s2 = new StaticKey("Ankush", 125);
        StaticKey s3 = new StaticKey("Ankush", 125);

        System.out.println(s1.numStudents);
        System.out.println(s2.numStudents);
    }
}

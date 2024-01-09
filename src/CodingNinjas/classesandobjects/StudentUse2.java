package CodingNinjas.classesandobjects;

public class StudentUse2 {

        public static void main(String[] args){
            //Scanner s= new Scanner(source)
            Student1 s1= new Student1();
            Student1 s2= new Student1();
            System.out.println(s1);
            s1.name="Manisha";
            s1.rollNumber = 10;
            System.out.println(s1.name + " "+ s1.rollNumber);

            s2.name= "Ankush";
            s2.rollNumber= 50;

            System.out.println(s2.name + " " + s2.rollNumber);
        }
    }


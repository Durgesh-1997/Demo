package OOPSinJAVA;
import java.util.Scanner;
public class StudentClass {
    // create a new data type
    public static void change(Student s){
        s.name = "Umesh";
    }

    public static void main(String[] args) {

        Student x = new Student();
        x.name = "Sachin";
        x.rno = 76;
        x.percent = 92.5;
        System.out.println(x.name );
        System.out.println(x. rno);
        System.out.println(x.percent);

        Student s1 = new Student();
        s1.name = "Durgesh";
        s1.rno = 18511;
        s1.percent = 67;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        change(s1);
        System.out.println(s1.name);


    }
}

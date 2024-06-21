package Encapsulation;


// Shadowing Problem
class Student6{
    private int age;
    private String name;

    public void setData1(int a)
    {
        age=a;

    }
    public void setData2()
    {
        name="Navin";

    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo6{
    public static void main(String[] args){
        Student6 obj=new Student6();
        Student6 obj1=new Student6();
        obj.setData1(18);
        obj1.setData1(25);
        obj.show();
        obj1.show();


    }
}

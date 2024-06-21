package Encapsulation;

class Student5{
    private int age;
    private String name;

    public void setData()
    {
        age=18;
        name="Navin";
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo5{
    public static void main(String[] args){
        Student5 obj=new Student5();
        Student5 obj1=new Student5();
        obj.setData();
        obj1.setData();
        obj.show();
        obj1.show();

    }
}

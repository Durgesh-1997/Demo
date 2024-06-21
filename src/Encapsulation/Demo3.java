package Encapsulation;

class Student3{
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
public class Demo3{
    public static void main(String[] args){
        Student3 obj=new Student3();
        obj.setData();
        obj.show();
    }
}

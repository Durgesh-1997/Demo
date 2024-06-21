package Encapsulation;

//this Keyword
class Student7{
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age=age;

    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name="Navin";

    }
    public String getName()
    {
        return name;
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo7{
    public static void main(String[] args){
        Student7 obj=new Student7();
        Student7 obj1=new Student7();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Navin");
        obj1.setName("kiran");
        obj.show();
        obj1.show();
    }
}
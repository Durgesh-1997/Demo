package OOPSinJAVA;

public class Person {
    int age;
    String name;
    String gender;


}


class main{
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.age = 20;
        obj1.name = "Sachin";
        obj1.gender = "Male";
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        System.out.println(obj1.gender);


        Person obj2 = new Person();
        obj2.age = 26;
        obj2.name = "Durgesh";
        obj2.gender = "Male";
        System.out.println(obj2.age);
        System.out.println(obj2.name);
        System.out.println(obj2.gender);
    }
}

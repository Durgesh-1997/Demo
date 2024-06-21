package OOPSinJAVA;

class Human //Super class // Base class// Parent class
{
    int age;
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Students extends Human  // Child class// sub class // derived class
{

}

class Inheritance1
{
    public static void main(String[] args)
    {

        Students st=new Students();

        st.sleep();

    }
}

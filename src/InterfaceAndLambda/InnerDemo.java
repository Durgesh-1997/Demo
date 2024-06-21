package InterfaceAndLambda;

class a
{

    public void show()
    {
        System.out.println("in A show");
    }
    static class b
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}


public class InnerDemo {
    public static void main(String[] args) {
        a obj = new a();
        obj.show();

        a.b obj1 = new a.b();
        obj1.display();
    }
}

package InterfaceAndLambda;

interface C
{
    void show();
    default void config()
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}

class D implements C
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class Java8Fe {
    public static void main(String[] args) {
        C.abc();
        C obj = new D();
        obj.config();
    }
}

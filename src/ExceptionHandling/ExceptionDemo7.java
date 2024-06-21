package ExceptionHandling;
// handling vs ducking

class Demo1
{
    public void a() throws Exception
    {
        System.out.println("in a");
        int value=9;

        b();

    }
    public void b() throws Exception
    {
        int num1=9;
        int num2=0;

        int result=num1 / num2;
        System.out.println(result);
    }
}

public class ExceptionDemo7
{
    public static void main(String[] agrs) throws Exception {
        Demo1 obj=new Demo1();
        obj.a();
        obj.b();
    }
}

package ExceptionHandling;

// try with multiple catch Blocks

public class
ExceptionDemo2
{
    public static void main(String[] args)
    {
        int num1=6;
        int num2=2;
        int result=0;
        int values[]={4,7,2,9};
        String name=null;

        try
        {
            result=num1/num2;
            System.out.println(values[0]);
            System.out.println(name.length());
        }

        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide the number by Zero");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.." +e);
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}

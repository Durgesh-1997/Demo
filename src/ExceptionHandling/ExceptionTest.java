package ExceptionHandling;

// Checked and Unchecked Exception

public class ExceptionTest
{
    public static void main(String[] args)
    {
        try {
            int result = 7 / 0;
            System.out.println(result);
        }

        catch (Exception e){
            System.out.println("Somethin went wong"+e);
        }
    }
}

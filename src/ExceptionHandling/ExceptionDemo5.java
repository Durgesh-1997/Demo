package ExceptionHandling;

// try With Resources

import java.util.Scanner;
public class ExceptionDemo5
{
    public static void main(String[] args)
    {
        int num=0;

        // try with Resources
        try(Scanner sc=new Scanner(System.in))
        {
            num=sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Something went wrong"+e);
        }


        System.out.println(num);

    }
}

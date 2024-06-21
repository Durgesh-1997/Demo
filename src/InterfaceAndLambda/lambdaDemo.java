package InterfaceAndLambda;

@FunctionalInterface
interface Cars
{
    void drive();
}
public class lambdaDemo{
    public static void main(String args[]){
        Cars obj=()->System.out.println("Driving...");

        obj.drive();
    }
}

package Method;

public class Variable1 {
     static void changeValue(int a){
        a *=100;
        System.out.println("Inside change value" +a);

    }
    public static void main(String[] args) {
//        Algebra obj = new Algebra();
//        obj.demo();


        int a =10;
        System.out.println("Before changing value " +a);
        changeValue(a);
        System.out.println("After changing value " +a);

    }

}









package Method;

class Algebra0{
    //instance variable
    int a = 10; //member variables class level scope member are access in the whole class
    int b = 5;

//add Method
    int add(){
        //local variable
        int p = 100;
        int q = 20; //method level scope member variable are access in only inside of the method
        return p+q;
    }

    //sub method
    int sub(){
        //local variable
      int  p = 2;
       int  q= 3;
        return p-q;

    }

    void demo(){
        int a =5;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<5; i++)
        {
            System.out.println(i);
//            int b = 10;//block level scope
//            System.out.println(b);
        }



//        for(int i =0; i<2; i++)
//        {
//            System.out.println(i);
//            int b = 100;
//            System.out.println(b);
//        }
//        System.out.println(b);
    }

    public static void main(String[] args) {
        //object declearation
        Algebra0 obj = new Algebra0();
        //call 
//        obj.demo();
        System.out.println(obj.add());
    }

}



//public class Variable {
//    static void changeValue(int a){
//        a *=100;
//        System.out.println("Inside change value" +a);
//
//    }
//    public static void main(String[] args) {
//
//
//        int a =10;
//        System.out.println("Before changing value " +a);
//        changeValue(a);
//        System.out.println("After changing value " +a);
//
//    }
//}

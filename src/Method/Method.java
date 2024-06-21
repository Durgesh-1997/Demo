package Method;

//class Method.Algebra1{

//    int add(int a, int b){
//        int ans = a + b;
//        return ans;
//    }
//}
//public class Method.Method {
//    public static void main(String[] args) {
//        Method.Algebra1 obj1 = new Method.Algebra1();
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("Sum of Input number is");
//        int ans = obj1.add(a,b);
//        System.out.println(ans);
//
//    }
//}




class Algebra1{

    int a;  //member variable scope
    int b;
    Algebra1(int x, int y){
        System.out.println("Constructor of Algebra class");
        a =x;
        b = y;
    }
    int add(){
        int ans = a + b;
        return ans;
    }

    int sub(){
     return a - b;
    }

    int mul(){
        return a * b;
    }
}
public class Method {
    public static void main(String[] args) {
        Algebra1 obj1 = new Algebra1(5,7);
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

        System.out.println("Sum of Input number is");
        int ans = obj1.add();
        System.out.println(ans);
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());



        Algebra1 obj2 = new Algebra1(10,7);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());



    }
}

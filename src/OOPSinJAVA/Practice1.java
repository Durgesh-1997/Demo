package OOPSinJAVA;//public class Practice1 {
//    public static void main(String[] args) {
//        int n=5,i,j,k;
//
//        for (i=0;i<=n;i++){
//            for (j=n;j>i;j--){
//                System.out.print(" ");
//            }
//            for (k=1;k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//
//        for (i=n;i>0;i--){
//            for (j=n;j>
//                    i;j--){
//                System.out.print(" ");
//            }
//            for (k=1;k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//
//}


//public class Practice1 {
//    public static void main(String[] args) {
//        int n=5,i,j,k;
//
//        for (i=1;i<=n;i++){
//            for (j=n;j>i;j--){
//                System.out.print(" ");
//            }
//            for (k=1;k<=(i-1);k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//
//        for (i=n;i>0;i--){
//            for (j=n;j>i;j--){
//                System.out.print(" ");
//            }
//            for (k=1;k<=(i-1);k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//
//}

//
//public class Practice1 {
//    public static void main(String[] args) {
//        int n=5,i,j,k;
//
//        for (i=0;i<=n;i++){
//            for (j=1;j<=
//                    n;j++){
//                System.out.print(" ");
//            }
//            for (k=1;k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//
//        for (i=n-1;i>0;i--){
//            for (j=1;j<=n;j++){
//                System.out.print(" ");
//            }
//            for (k=1;k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//
//}


class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
class CallByValue {
    public static void main(String args[]) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a and b before call: " +
                a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " +
                a + " " + b);
    }
}
 

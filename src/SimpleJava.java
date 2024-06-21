import java.util.Calendar;
import java.util.*;
//public class SimpleJava {
////    public static void main(String[] args) {
////        for (int i=1; i<4; i++) {
////            for (int j=1; j<=2*i-1; j++) {
////                System.out.print("*");
////            }
////            System.out.println();
////        }
////    }
//
//
////public static void main(String args[]) {
////    Runtime r = Runtime.getRuntime();
////    long mem1, mem2;
////    Integer someints[] = new Integer[1000];
////    System.out.println("Total memory is: " +
////            r.totalMemory());
////    mem1 = r.freeMemory();
////    System.out.println("Initial free memory: " + mem1);
////    r.gc();
////    mem1 = r.freeMemory();
////    System.out.println("Free memory after garbage collection: "
////            + mem1);
////    for(int i=0; i<1000; i++)
////        someints[i] = new Integer(i); // allocate integers
////    mem2 = r.freeMemory();
////    System.out.println("Free memory after allocation: "
////            + mem2);
////    System.out.println("Memory used by allocation: "
////            + (mem1-mem2));
////// discard Integers
////    for(int i=0; i<1000; i++) someints[i] = null;
////    r.gc(); // request garbage collection
////    mem2 = r.freeMemory();
////    System.out.println("Free memory after collecting" +
////            " discarded Integers: " + mem2);
////}
//
////    public static void main(String args[]) {
////        Runtime r = Runtime.getRuntime();
////        Process p = null;
////        try {
////            p = r.exec("notepad");
////        } catch (Exception e) {
////            System.out.println("Error executing notepad.");
////        }
////    }
//
////    public static void main(String args[]) {
////        Runtime r = Runtime.getRuntime();
////        Process p = null;
////        try {
////            p = r.exec("notepad");
////            p.waitFor();
////        } catch (Exception e) {
////            System.out.println("Error executing notepad.");
////        }
////        System.out.println("Notepad returned " + p.exitValue());
////    }
//
////    public static void main(String args[]) {
////        try {
////            ProcessBuilder proc =
////                    new ProcessBuilder("notepad.exe", "testfile");
////            proc.start();
////        } catch (Exception e) {
////            System.out.println("Error executing notepad.");
////        }
////    }
//
////    public static void main(String args[]) {
////        long start, end;
////        System.out.println("Timing a for loop from 0 to 1,000,000");
////        start = System.currentTimeMillis(); // get starting time
////        for(int i=0; i < 1000000; i++) ;
////        end = System.currentTimeMillis(); // get ending time
////        System.out.println("Elapsed time: " + (end-start));
////    }
//
////    public static void main(String args[]) {
////        Package pkgs[];
////        pkgs = Package.getPackages();
////        for(int i=0; i < pkgs.length; i++)
////            System.out.println(
////                    pkgs[i].getName() + " " +
////                            pkgs[i].getImplementationTitle() + " " +
////                            pkgs[i].getImplementationVendor() + " " +
////                            pkgs[i].getImplementationVersion()
////            );
////    }
//
//
//
////        public static void main(String args[]) {
////            String months[] = {
////                    "Jan", "Feb", "Mar", "Apr",
////                    "May", "Jun", "Jul", "Aug",
////                    "Sep", "Oct", "Nov", "Dec"};
////// Create a calendar initialized with the
////// current date and time in the default
////// locale and timezone.
////            Calendar calendar = Calendar.getInstance();
////// Display current time and date information.
////            System.out.print("Date: ");
////            System.out.print(months[calendar.get(Calendar.MONTH)]);
////            System.out.print(" " + calendar.get(Calendar.DATE) + " ");
////            System.out.println(calendar.get(Calendar.YEAR));
////            System.out.print("Time: ");
////            System.out.print(calendar.get(Calendar.HOUR) + ":");
////            System.out.print(calendar.get(Calendar.MINUTE) + ":");
////            System.out.println(calendar.get(Calendar.SECOND));
////// Set the time and date information and display it.
////            calendar.set(Calendar.HOUR, 10);
////            calendar.set(Calendar.MINUTE, 29);
////            calendar.set(Calendar.SECOND, 22);
////
////            System.out.print("Updated time: ");
////            System.out.print(calendar.get(Calendar.HOUR) + ":");
////            System.out.print(calendar.get(Calendar.MINUTE) + ":");
////            System.out.println(calendar.get(Calendar.SECOND));
////        }
//
//
//    public static void main(String args[]) {
//        Currency c;
//        c = Currency.getInstance(Locale.CANADA_FRENCH);
//        System.out.println("Symbol: " + c.getSymbol());
//        System.out.println("Default fractional digits: " +
//                c.getDefaultFractionDigits());
//    }
//}


//public class SimpleJava{
//    public static void main(String[] args) {
//        int a= 5;
//        int b= 4;
//        System.out.println(a+b);
//        int sum= a+b;
//        System.out.println(sum);
//        System.out.println(++a);
//        System.out.println(--b);
//        System.out.println(a/b);
//        System.out.println(a+b);//9
//        System.out.println(a-b);//1
//        System.out.println(a*b);//20
//        System.out.println(a/b);//1
//        System.out.println(a%b);//1
//        System.out.println(b%a);//4
//        System.out.println(a+=b);//9
//        System.out.println(a);//9
//        System.out.println(a-=b);//5
//        System.out.println(b*=a);//20
//        System.out.println(b);//20
//        System.out.println(a%=b);//5
//        System.out.println(a==b);//false
//        System.out.println(a|b);//21
//        System.out.println(a&b);//4
//        System.out.println(a!=b);//true
//        System.out.println(b^a);//17
//    }
//}

//public class SimpleJava {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x=sc.nextInt();
//        if (x<18){
//            System.out.println("Child");
//        } else if (x>=18 && x<60) {
//            System.out.println("youngest");
//        }else {
//            System.out.println("Oldest");
//        }
//    }
//}

//public class SimpleJava {
//    public static void main(String[] args) {
//        for (int i=0;i<=10;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        int n= 10;
//        for (int i=0;i<=n;i++){
//           for (int j=0;j<=n-i;j++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }
//        System.out.println("   ");
//       outer: for (int i=0;i<=10;i++){
//            for (int j=0;j<=n;j++){
//                if(j > i) {
//                    System.out.println();
//                    continue outer;
//                }
//                System.out.print(" " + (i * j));
//            }
//
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        for (int i=0;i<n;i++){
//            for (int j=n-i;j>1;j--){
//                System.out.print(" ");
//            }
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println(" ");
//        for (int i=0;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("  ");
//
//        for (int i=0;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=0;i<=n;i++){
//            for (int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class SimpleJava {
//
//    public static void main(String[] args) {
//        int n= 10;
//        for (int i=0;i<=n;i++){
//           for (int j=0;j<=n+1-i;j++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }
//
//
public  class SimpleJava {
    public static void main(String[] args) {
        int i =0;
       int count=0;
        while (i!=10){
            System.out.print("*");
            count=i++;
        }
        System.out.println(count);

    }
}

package Conditionals;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter cost price : ");
        int cp = sc.nextInt();
        System.out.println(" Enter selling price : ");
        int sp = sc.nextInt();
//        if(sp>cp){
//            System.out.print(" You Gained a profit  :  ");
//            System.out.println(sp-cp);
//        }
////        if(cp>sp){
////            System.out.println(" You Incurred a loss");
////        }
//        else{
//            System.out.println(" You Incurred a loss");
//        }
        if(sp>cp){
            System.out.println(" Your profit is : ");
            int profit = sp-cp;
            System.out.println(profit);
        }
        else{
            System.out.println(" Your loss is : ");
            int loss = cp - sp;
            System.out.println(loss);
        }
    }
}

package Conditionals;

public class ContinueKeyword {
    public static void main(String[] args) {
        //for loop metho
        myloop:for (int num = 1; num<= 50; num++){
            if (num % 3 == 0){
                continue myloop;
            }
            System.out.println(num);
        }



//                 //While loop method
//        int num = 1;
//        while (num <= 50){
//            if (num % 3 ==0){
//                num++;
//                continue;
//
//            }
//            System.out.println(num);
//            num++;
//        }

    }
}

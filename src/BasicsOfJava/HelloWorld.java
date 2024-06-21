package BasicsOfJava;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello Java");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(money);


        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }



//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                if (i==1 && j==1)continue;
//                System.out.println(i+" "+j);
//            }
//        }

//        for (int i=0;i<=3;i++){
//            for (int j=1;j<=3;j++){
//                System.out.print(j+" ");
//            }
//        }
    }
}

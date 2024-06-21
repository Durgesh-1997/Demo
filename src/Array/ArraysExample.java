package Array;

public class ArraysExample {
 void multiArrays(){
        int[][] arr_1 = new int[5][3];
        int[][] arr = {{56,43,6},{34,7,8},{12,56,8}};


        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);



    }
}



class main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
//        obj.demoArrays();
        obj.multiArrays();
//        obj.threedArrays();
    }

}



//    void demoArrays(){
////        int[] ages = new int[3];
////        float[] weights = new float[3];
//////        String[] names = new String[3];
////        String[] names = { "Sachin","Sunil","Durgesh","Deva"};
//
//        ages[0] = 43;
//        ages[1] = 12;
//        ages[2] = 45;
////        ages[3] = 46
//        System.out.println(ages.length);
//        System.out.println(weights.length);
//        System.out.println(names.length);
//
//        weights[0] = 23.8f;
//        weights[1] = 87.5f;
//
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//
//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
//
//        System.out.println(weights[0]);
//        System.out.println(weights[1]);
//    }
//}
//
//
//
//
//
//
////    void threedArrays(){
////        int[][][] arr_3 = new int[5][3][2];
////        int[][][] arr = {{{1,2,3},{4,5,6,},{7,8,9}}} ;
////
////        System.out.println(arr[0][0][0]);
////        System.out.println(arr[0][1][1]);
////
////    }
////}
package Array;

class singlearrayexample{

    void singleArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];

        ages[0]= 34;
        ages[1]= 12;
        ages[2]=45;
//        ages[5]= 46;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        names[0] = "Sachin";
        names[1] ="Sunil";
        names[2] = "Durgesh";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        weights[0] = 45;
        weights[1] = 36;
        weights[2] = 47;

        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

    }

}



class multiarrayexample{
    void multiArrays(){
        int[][] arr = {{56,43,6},{34,7,8},{12,56,8}};

        int [][][] arr3 = new int[5][3][2];

        int i,j,idx=0;
        for (i=0;i<=arr.length-1;i++){
            for (j=0;j<= arr.length-1;j++){
                System.out.println(idx+" = "+arr[i][j]);
                idx++;
            }

        }


//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);
//        System.out.println(arr[2][0]);
//        System.out.println(arr[2][1]);
//        System.out.println(arr[2][2]);
    }
}
public class DemoArrays {
    public static void main(String[] args) {
        singlearrayexample obj = new singlearrayexample();
        multiarrayexample obj1 = new multiarrayexample();
//        obj.singleArrays();
        obj1.multiArrays();
    }

}

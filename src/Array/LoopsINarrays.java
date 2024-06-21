package Array;

public class LoopsINarrays {


    void demoArrays() {
        int[] ages = new int[3];
        float[] weights = new float[3];
//        String[] names = new String[3];
        String[] names = {"Sachin", "Sunil", "Durgesh", "Deva"};


        ages[0] = 43;
        ages[1] = 12;
        ages[2] = 45;
//        ages[3] = 46
//        for(int i=0;i<3;i++){     //for loop
//            System.out.println(ages[i]);
//
//        for(int age : ages){      //for Each loop
//            System.out.println(age);
//
//        }
        int i = 0;
        while(i<3){                        //while loop//
            System.out.println(ages[i]);
            i = i+1;
        }
    }




    void multiArrays(){
        int[][] arr = {{56,43,6},{34,7,8},{45,48,68}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }


    void sumOfArray(){
        int[] arr = {1,4,5,6,1};
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }



    void maxOfArray(){
        int[] arr = {5,3,6,2,8,4};

        int ans = 0;

        for(int i =0; i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("Max  "+ ans);
    }



    void searchInArray(){
        int[] arr = {10,5,3,6,2,8,4};
        int x = 20;
        int ans = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}




class Loop {
    public static void main(String[] args) {
        LoopsINarrays obj = new LoopsINarrays();
        obj.demoArrays();
        System.out.println("  ");
        obj.multiArrays();
        System.out.println("  ");
//        obj.threedArrays();
          obj.sumOfArray();
        System.out.println("   ");
        obj.maxOfArray();
        obj.searchInArray();

    }

}

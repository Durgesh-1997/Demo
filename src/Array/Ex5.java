package Array;
//Jagged Array
public class Ex5 {
    public static void main(String[] args){
        int nums[][]= new int[3][3];

         nums[0][0]=3;
         nums[0][1]=9;
         nums[1][0]=1;
         nums[1][1]=5;
         nums[2][0]=8;
         nums[2][1]=4;
        System.out.println(nums[0][0]);




//        int nums[][]={
//                {3,9,7,5},
//                {1,5},
//                {8,4,5}
//        };
//        for(int i=0;i<=2;i++)
//        {
//            for(int j=0;j<nums[i].length;j++)
//            {
//                System.out.print(nums[i][j]+ " ");
//            }
//            System.out.println();
//        }
    }
}
// Output:
// 3 9 7 5
//1 5
//8 4 5
package Array;

//2D array print
public class Ex3{
    public static void main(String[] args){
        int nums[][]= new int[3][2];
        nums[0][0]=3;
        nums[0][1]=9;
        nums[1][0]=1;
        nums[1][1]=5;
        nums[2][0]=8;
        nums[2][1]=4;
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
//Output: 3 9
//        1 5
//        8 4
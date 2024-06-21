package Array;

public class Ex4 {
    public static void main(String[] args){
        int nums[][]= {
                {3,9},
                {1,5},
                {8,9}
        };

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

//Output:
// 3 9
//1 5
//8 9
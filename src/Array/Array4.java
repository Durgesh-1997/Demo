package Array;
//sorting method
import java.util.Scanner;

public class Array4 {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the length of array:" );
            int n = scn.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array value");
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            int[] ans = new int[n];
            int idx = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] >= 0){
                    ans[idx] = arr[i];
                    idx++;
                }
            }
            for(int i = 0; i < n; i++){
                if(arr[i] < 0){
                    ans[idx] = arr[i];
                    idx++;
                }
            }
            for(int i = 0; i < n; i++){
                System.out.print(ans[i] + " ");
            }
        }

}

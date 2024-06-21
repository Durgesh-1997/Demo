package Array;

// Anonymous Array:

class Calc5 {
    public int add(int nums[]) {
        int result = 0;
        for (int n : nums) {
            result = result + n;
        }
        return result;
    }
}

    public class Demo5 {
        public static void main(String[] args) {

            Calc5 obj = new Calc5();
            int result = obj.add(new int[]{5, 2, 3, 7, 8, 2});
            System.out.println(result);
        }
    }

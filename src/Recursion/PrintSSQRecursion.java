package Recursion;

public class PrintSSQRecursion {

    static void printSSQ(String s, String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);

        // Curr char - chooses to be a part of currAns
        printSSQ(remString, currAns + curr); // bc
        printSSQ(remString, currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc", "");

    }
}

package Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DigitToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();

        String result = null;
        switch (x){
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            case 10:
                result = "X";
                break;
            default:
                result = "Invalid Input";

        }
        System.out.println(result);
    }
}

package chardata;
import java.util.Scanner;
public class chardatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // char ch = 'A';
        //System.out.println(ch);
//        char ch = 'M';
//        System.out.println(ch);
       // char ch = 'Q';
       // System.out.println(ch);
//        char ch = '!';
//        System.out.println(ch);
        // a b c d e f g h i j k l m n o  p q r s t u v w x y z
        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        // ! @ # $ % ^ & * ( ) { } [ ] \ | ; : ' " / ? . , < > - + _ ~ `
        // 0 1 2 3 4 5 6 7 8 9
//        char ch = 'a';
       // char ch = 'z';
//        char ch = '#';
       // char ch = '&';
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        int x = (int)ch;
        System.out.println(x );


    }
}

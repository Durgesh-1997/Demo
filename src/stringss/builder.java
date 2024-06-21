package stringss;
import java.util.*;
public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);   /// append()
        //hello -> mello
        str.setCharAt(0,'m');  /// setCharAt(idx,ch)
        System.out.println(str);
        str.append(10);  //append
        System.out.println(str); //mello
        str.insert(2,'y'); //insert
        System.out.println(str);  //mello10
        str.deleteCharAt(0);  //eyllo10
        System.out.println(str);
        StringBuilder sb = new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        // physics
//        sb.delete(1,5);  //2 to 3 delete
        System.out.println(sb);
        System.out.println(sb.substring(3));




    }
}

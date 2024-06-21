package BasicsOfJava;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        demo("1,2,3,4");
        demo("sdd,ddd,ddfff,rfrg,gtgtr");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}

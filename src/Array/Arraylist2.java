package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {
    static void reverseList(ArrayList<Integer> list){

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List " + list);
        Collections.reverse(list);
        System.out.println("Revers List " + list);
        Collections.sort(list);
        System.out.println("Ascending Order " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order " + list);



        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("OG " + l1);
        Collections.sort(l1);
        System.out.println("Sorted " + l1);//string lexico graphic sorting
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Sorting  Revers" + l1);

    }
}

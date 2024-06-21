package Array;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
//        // wrapper classes
        Integer I = Integer.valueOf(4);
        System.out.println(I);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        ArrayList<Float> l3 = new ArrayList<>();

        // add new element
        l1.add(5); //5
        l1.add(6); //5 6
        l1.add(7); //5 6 7
        l1.add(8); //5 6 7 8

        //get an element at index i
        System.out.println(l1.get(1)); //6

//        // print with for loop
//        for(int i = 0;i<l1.size(); i++){
//            System.out.println(l1.get(i)); // 5,6,7,8
//        }

        //print the array list directly
        System.out.println(l1);//[5,6,7,8]

        //adding element  at some index i // [5 100 6 7 8]
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1); ///[5 10 6 7 8]


        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);//5 6 7 8


        // removing an element e
//        l1.remove(Integer.valueOf(7));
        System.out.println(l1.remove(Integer.valueOf(7)));
        System.out.println(l1.remove(Integer.valueOf(17)));
        System.out.println(l1); //5 6 8



        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);


        //if you don't specific class you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("pqrse");
        l.add(1);
        l.add(true);

        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l);



    }
}

package MapandGenerics;


import java.util.*;
public class Map4
{
    public static void main(String[] args)
    {
        Hashtable ht=new Hashtable();
        ht.put(1, "Rohit");
        //ht.put(2, "Rohan");
        ht.put(3, "Ramesh");
        // ht.put(null, "Hyder");

        ht.putIfAbsent(2, "Rohan");

        System.out.println(ht);


        Integer i=new Integer(2);
        
        TreeMap tm=new TreeMap();
        tm.put(i, "Rohan");
        tm.put(4, "Rohit");
        tm.put(1, "Ramesh");
        tm.put(3, "Rahul");

        System.out.println(tm);

    }

}


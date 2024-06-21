package HashmapStackAndQueue;

import java.util.*;
import java.util.Map;
import java.io.*;

//KEY & VALUE INSERTION

//public class HashmapStackAndQueue.HashMapClass {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements of Key-pair: ");
//
//        int n = sc.nextInt();
//
//
//        TreeMap<Integer, String> tm = new TreeMap<>();
//
//        System.out.print("Enter the elements in Key and value : ");
//        for(int i=0;i<n;i++){
//            int key = sc.nextInt();
//            String value = sc.next();
//            tm.put(key, value);
//        }
//
//        System.out.println("The value of Map is: " + tm);
//
//    }
//}

// KEY & VALUE INSERTION

//public class HashmapStackAndQueue.HashMapClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of key-value pairs :");
//        int n = sc.nextInt();
//
//        TreeMap<String,Integer> map = new TreeMap<>();
//        System.out.println("Enter the key value pairs :");
//        for(int i=0 ; i<n ; i++){
//            int key = sc.nextInt();
//            String value = sc.next();
//            map.put(value,key);
//        }
//        System.out.println("The Map is:"+map);
//    }
//}

//KEY & VALUES INSERTION METHOD

//public class HashmapStackAndQueue.HashMapClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of key-value pairs :");
//        int n = sc.nextInt();
//
//        TreeMap<Integer,String> map = new TreeMap<>();
//        System.out.println("Enter the key value pairs :");
//        for(int i=0 ; i<n ; i++){
//            int key = sc.nextInt();
//            String value = sc.next();
//            map.put(key,value);
//        }
//        System.out.println("The Map is:"+map);
//    }
//}



//FINDING DUPLICATE ELEMENT IN THE ARRAYS

//public class HashmapStackAndQueue.HashMapClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of element in array :");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the element of the array :");
//        for(int i=0;i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        boolean duplicate = false;
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int i=0;i<n;i++){
//            if(map.containsKey(arr[i])){
//                duplicate = true;
//                System.out.println("Yes");
//                break;
//            }
//            map.put(arr[i],1);
//        }
//        if(duplicate==false){
//            System.out.println("No");
//        }
//
//
//    }
//}

//FIND THE LARGEST ELEMENT IN THE ARRAYS

//public class HashmapStackAndQueue.HashMapClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of element in array :");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the element of the array :");
//        for(int i=0;i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        TreeMap<Integer,Integer> map = new TreeMap<>();
//
//        for(int i=0;i<n;i++){
//            map.put(arr[i],1);
//        }
//        System.out.println("The Largest element is :"+map.lastEntry().getKey());
//
//
//    }
//}



public class HashMapClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransomnote string :");
        String r = sc.nextLine();
        System.out.println("Enter the magazine string :");
        String m = sc.nextLine();

        HashMap<Character,Integer> map1 =new HashMap<>();
        for(int i=0;i<r.length();i++){
            char c = r.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else{
                map1.put(c,1);
            }
        }
        HashMap<Character,Integer> map2 =new HashMap<>();
        for(int i=0;i<m.length();i++){
            char c = m.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }

        boolean ans = true;
        for(Map.Entry<Character,Integer> e : map1.entrySet()){
            if(!map2.containsKey(e.getKey()) || e.getValue()>map2.get(e.getKey())){
                ans = false;
                break;

            }
        }
        System.out.println(ans);


    }
}





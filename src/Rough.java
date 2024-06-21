//KARMA star pattern

//public class Rough {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =9;
//        int i,j;
//        for(i=0;i<=n;i++){
//            for (j=0;j<=n;j++){
//                if (j==0 ||i-j==n/2-1|| i+j==n/2+1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("  ");
//            for (j=0;j<=n;j++){
//                if (j==0&& i!=0||j==n-1&& i!=0|| i==0&&j>=1&&j<=n-2||i==n/2&&j<=n-1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print(" ");
//            for (j=0;j<=n;j++){
//                if (j==0|| i==0&&j>=1&&j<=n||i==n/2&&j<=n-1|| j==n && i<=n/2 || i-j==(n-4)/2 ){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("  ");
//            for (j=0;j<=n;j++){
//                if (j==0|| j-i==1&&i<=n/2-1||j==n|| i+j==n-1&& j>n/2 ){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("  ");
//            for (j=0;j<=n;j++){
//                if (j==0&& i!=0||j==n && i!=0 || i==0&& j>=1&&j<=n-1 || i==n/2 ){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//
//        }
//
//    }
//
//}


//public class Rough {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of : a");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of : b");
//        int b = sc.nextInt();
//        if(a>b){
//            System.out.println(" A is greatest");
//        } else if (b>a) {
//            System.out.println(" B is greatest ");
//        }else {
//            System.out.println(" A and B are equal");
//        }
//
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value ");
//        int a = sc.nextInt();
//
//       if (a>18 && a<60){
//           System.out.println("Younger");
//       }else if (a<18){
//           System.out.println(" Child");
//       }else {
//           System.out.println(" Senior Cetizen");
//       }
//
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value ");
//        int a = sc.nextInt();
//        int sum = a<<2;
//        System.out.println(sum);
//        if(sum>a){
//            System.out.println(" surr");
//        }else{
//            System.out.println(" sddfdf");
//        }
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//       int [] arr = new int[n];
//       int i=0;
//       for(i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//
//       }
//
//
//        for(i=0;i<n;i++){
//
//            System.out.print(arr[i] +",");
//        }
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Boolean> l2 = new ArrayList<>();
//
//
//        l1.add(4);
//        l1.add(5);
//        l1.add(6);
//        l1.add(7);
//        l1.add(18);
//        l1.add(9);
//        l1.add(10);
//        System.out.println(l1);
//        System.out.println(l1.get(1));
//        boolean ans = l1.contains(Integer.valueOf(6));
//        System.out.println(ans);
//        TreeSet<Integer > t1 = new TreeSet<>();
//        t1.add(5);
//        t1.add(55);
//        t1.add(45);
//        t1.add(500);
//        t1.add(40);
//        t1.add(75);
//        t1.add(65);
//        t1.add(15);
//        System.out.println(t1);

//        HashMap<Integer,String> mp = new HashMap<>();
//        mp.put(1,"Aman");
//        mp.put(5,"Sachin");
//        mp.put(3,"Baba");
//        mp.put(2,"Deva");
//        mp.put(4,"Krishna");
//        System.out.println(mp);

//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.add(5);
//        d1.add(55);
//        d1.add(45);
//        d1.add(23);
//        System.out.println(d1);


//        Hashtable<Integer,String> ht = new Hashtable<>();
//        ht.put(1,"Sachin");
//        ht.put(5,"deva");
//        ht.put(3,"Papa");
//        ht.put(4,"Dad");
//        ht.put(2,"baba");
//        System.out.println(ht);

//        LinkedHashSet<Integer> LH= new LinkedHashSet<>();
//        LH.add(5);
//        LH.add(89);
//        LH.add(6);
//        LH.add(4);
//        LH.add(53);
//        LH.add(2);
//        System.out.println(LH);


//        SortedSet<Integer>ss = new SortedSet<Integer>() {
//            @Override
//            public Comparator<? super Integer> comparator() {
//                return null;
//            }
//
//            @Override
//            public SortedSet<Integer> subSet(Integer fromElement, Integer toElement) {
//                return null;
//            }
//
//            @Override
//            public SortedSet<Integer> headSet(Integer toElement) {
//                return null;
//            }
//
//            @Override
//            public SortedSet<Integer> tailSet(Integer fromElement) {
//                return null;
//            }
//
//            @Override
//            public Integer first() {
//                return null;
//            }
//
//            @Override
//            public Integer last() {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Integer> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Integer> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//        };


// /∗∗ Returns the sum of the first n integers of the given array. ∗/

//    }
//}


//public class Rough {
//    public static int linearSum(int[ ] data, int n) {
//        if (n == 0)
//            return 0;
//        else
//            return linearSum(data, n-1) + data[n-1];
//    }
//
//    public static void main(String[] args) {
//        Rough obj= new Rough();
//        int[] data = {1,2,3,4,5,6,7,8,9,1,1,};
//        int n=10;
//        int result = linearSum(data,10);// call linearSum method and call itself recursivelly and when function is end  and finally return the value of result
//        System.out.println(result);
//
//    }
//}
////Output:
////1+9+8+7+6+5+4+3+2+1+ n==0 return 0;
////sum= 46;


//public class Rough {
//    public static void reverseArray(int[] data, int low, int high) {
//        if (low < high) { // if at least two elements in subarray
//            int temp = data[low]; // swap data[low] and data[high]
//            data[low] = data[high];
//            data[high] = temp;
//            reverseArray(data, low + 1, high - 1);
//            return;
//
//
//        }
////        System.out.println(low);
//    }
//
//
//    public static void main(String[] args) {
//        int[] data = {1,2,3,4,5,6,7,8,9,1};
//        int n=10;
//        reverseArray(data,0,n-1);
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//
//        int[] data = {1,2,3,4,5,6,7,8,9,10};
//        int result=0;
//        for (int n:data) {
//             result=result+n;
//            System.out.println(n);
//        }
//        System.out.println("  ");
//        System.out.print("Sum of Array is :"+result);
//    }
//}
//
//Output:
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//
//        Sum of Array is :55


//import LinkedList.LinkedList;
//import LinkedList.basicsll;

import LinkedList.basicsll;

import java.util.*;


//public class Rough {
//    public static void main(String[] args) {
//
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the length of array:" );
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the array value");
//        for (int i=0;i<n;i++){
//            arr[i]= scn.nextInt();
//        }
//        int [] ans = new int[n];
//        int idx = 0;
//        for (int i = 0; i<n;i++){
//            if (arr[i]>0){
//                ans[idx] = arr[i];
//                idx++;
//
//            }
//        }
//        for (int i=0;i<n;i++){
//            if (arr[i]<0){
//                ans[idx] = arr[i];
//                idx++;
//            }
//        }
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+ " ");
//        }
//    }
//}
//
//
//Output: Enter the length of array:
//        5
//        Enter the array value
//        1
//        2
//        3
//        4
//        5
//        1 2 3 4 5

 public class Rough {
//     public static void main(String[] args) {
//        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
//        for (int i=0;i<3;i++){
//            for (int j =0;j<3;j++){
//                System.out.println(a[i][j]+"");
//                int k[]= new int[]{a[i][j]};
//              arr [] k++;
//
//            }
//        }
//     }
//
//     public static void main(String args[]) {
//         int twoD[][]= new int[4][5];
//         int i, j, k = 0;
//         for(i=0; i<4; i++)
//             for(j=0; j<5; j++) {
//                 twoD[i][j] = k;
//                 k++;
//             }
//         for(i=0; i<4; i++) {
//             for(j=0; j<5; j++)
//                 System.out.print(twoD[i][j] + " ");
//             System.out.println();
//         }
//     }

     // A simple Bean.

}






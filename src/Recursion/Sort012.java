package Recursion;

public class Sort012 {
    static void display(int[] num) {
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void sort012(int[] a) {
        int lo = 0, mid = 0, hi = a.length - 1;
        //explore the unknown region
        while (mid <= hi) {
            if (a[mid] == 0) {
                swap(a, mid, lo);
                mid++;
                lo++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a, mid, hi);
                hi--;
            }
        }

    }
}
package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationHeap {

    // function to swap two numbers
    public static void swapping(List<Integer> arr, int x,
                                int y)
    {
        int t = arr.get(y);
        arr.set(y, arr.get(x));
        arr.set(x, t);
    }

    // function to insert a value into the heap tree
    public static void insertHeapTree(List<Integer> hT,
                                      int val)
    {
        int treeSize = hT.size();
        if (treeSize == 0) {
            hT.add(val);
        }
        else {
            hT.add(val);
            int i = treeSize;
            while (i != 0
                    && hT.get(i) > hT.get((i - 1) / 2)) {
                swapping(hT, i, (i - 1) / 2);
                i = (i - 1) / 2;
            }
        }
    }

    // function to delete a value from the heap tree
    public static void deleteValue(List<Integer> hT,
                                   int val)
    {
        if (hT.size() == 0) {
            return;
        }

        int treeSize = hT.size();
        int i = 0;
        for (i = 0; i < treeSize; i++) {
            if (val == hT.get(i)) {
                break;
            }
        }

        if (i != hT.size()) {
            swapping(hT, i, treeSize - 1);
        }
        hT.remove(hT.size() - 1);
    }

    // function to print the heap tree
    public static void printArray(List<Integer> hT)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hT.size(); i++) {
            sb.append(hT.get(i)).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args)
    {
        List<Integer> heapTree = new ArrayList<Integer>();
        int delValue = 0;

        insertHeapTree(heapTree, 3);
        insertHeapTree(heapTree, 4);
        insertHeapTree(heapTree, 9);
        insertHeapTree(heapTree, 5);
        insertHeapTree(heapTree, 12);
        insertHeapTree(heapTree, 7);
        insertHeapTree(heapTree, 15);
        insertHeapTree(heapTree, 20);

        System.out.println(
                "HEAP DATA STRUCTURE - INSERT & DELETE OPERATION");
        System.out.println("Inserted Values in Heap-Tree");
        printArray(heapTree);

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter one value from above heap-tree values - to delete in Heap-Tree: ");
        delValue = sc.nextInt();

        deleteValue(heapTree, delValue);
        System.out.println("\nAfter deleting an element: ");
        printArray(heapTree);
    }
}


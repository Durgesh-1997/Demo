package Heap;

import java.util.*;

// Node class for Leftist Heap
class LeftistNode {
    int element, dist; // Node elements and distance
    LeftistNode left, right; // Left and right child of a node

    // Constructor for LeftistNode
    public LeftistNode(int element) {
        this(element, null, null);
    }

    // Constructor for LeftistNode
    public LeftistNode(int element, LeftistNode left, LeftistNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.dist = 0;
    }
}

// Class for Leftist Heap
class LeftistHeap {
    private LeftistNode root; // Root of the Leftist Heap

    // Constructor for LeftistHeap
    public LeftistHeap() {
        root = null;
    }

    // Check if heap is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Make heap empty
    public void makeEmpty() {
        root = null;
    }

    // Insert an element into heap
    public void insert(int x) {
        root = merge(new LeftistNode(x), root);
    }

    // Delete and return the minimum element from heap
    public int deleteMin() {
        if (isEmpty())
            throw new NoSuchElementException();
        int minItem = root.element;
        root = merge(root.left, root.right);
        return minItem;
    }

    // Merge two heaps
    private LeftistNode merge(LeftistNode x, LeftistNode y) {
        if (x == null)
            return y;
        if (y == null)
            return x;
        if (x.element > y.element) {
            LeftistNode temp = x;
            x = y;
            y = temp;
        }

        x.right = merge(x.right, y);

        if (x.left == null) {
            x.left = x.right;
            x.right = null;
        } else {
            if (x.left.dist < x.right.dist) {
                LeftistNode temp = x.left;
                x.left = x.right;
                x.right = temp;
            }
            x.dist = x.right.dist + 1;
        }
        return x;
    }

    // Merge current heap with another heap
    public void merge(LeftistHeap rhs) {
        if (this == rhs)
            return;
        root = merge(root, rhs.root);
        rhs.root = null;
    }
}

// Main class
public class Leftist {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 10, 15};
        int[] arr1 = {22, 75};

        LeftistHeap h = new LeftistHeap();
        LeftistHeap h1 = new LeftistHeap();
        LeftistHeap h2;

        // Insert elements into heaps
        for (int i : arr)
            h.insert(i);
        for (int i : arr1)
            h1.insert(i);

        // Delete minimum elements and print them
        System.out.println(h.deleteMin());
        System.out.println(h1.deleteMin());

        // Merge two heaps
        h.merge(h1);
        h2 = h;

        System.out.println(h2.deleteMin());
    }
}

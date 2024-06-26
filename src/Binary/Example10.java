package Binary;

/*package whatever //do not write package name here */
//Level order traversal of Binary Tree in Spiral form Using Deque:

import java.io.*;
        import java.util.ArrayDeque;
        import java.util.Deque;

class Example10 {

    // Defining Node class
    static class Node {

        int key;
        Node left;
        Node right;

        public Node(int key) { this.key = key; }
    }

    // Class to construct the tree
    static class MyTree {

        public MyTree(){};

        public Node root;
    }

    // Function that prints the tree in spiral fashion
    public static void spiralPrint(Node root)
    {

        // Declare a deque
        Deque<Node> dq = new ArrayDeque<>();

        // Insert the root of the tree into the deque
        dq.offer(root);

        // Create a variable that will switch in each
        // iteration
        boolean reverse = true;

        // Start iteration
        while (!dq.isEmpty()) {

            // Save the size of the deque here itself, as in
            // further steps the size of deque will
            // frequently change
            int n = dq.size();

            // If we are printing left to right
            if (!reverse) {

                // Iterate from left to right
                while (n-- > 0) {

                    // Insert the child from the back of the
                    // deque Left child first
                    if (dq.peekFirst().left != null)
                        dq.offerLast(dq.peekFirst().left);

                    if (dq.peekFirst().right != null)
                        dq.offerLast(dq.peekFirst().right);

                    // Print the current processed element
                    System.out.print(dq.pollFirst().key
                            + " ");
                }
                // Switch reverse for next traversal
                reverse = !reverse;
            }
            else {

                // If we are printing right to left
                // Iterate the deque in reverse order and
                // insert the children from the front
                while (n-- > 0) {
                    // Insert the child in the front of the
                    // deque Right child first
                    if (dq.peekLast().right != null)
                        dq.offerFirst(dq.peekLast().right);

                    if (dq.peekLast().left != null)
                        dq.offerFirst(dq.peekLast().left);

                    // Print the current processed element
                    System.out.print(dq.pollLast().key
                            + " ");
                }
                // Switch reverse for next traversal
                reverse = !reverse;
            }
        }
    }

    public static void main(String[] args)
    {
        MyTree mt = new MyTree();
        mt.root = new Node(1);
        mt.root.left = new Node(2);
        mt.root.right = new Node(3);
        mt.root.left.left = new Node(7);
        mt.root.left.right = new Node(6);
        mt.root.right.left = new Node(5);
        mt.root.right.right = new Node(4);

        System.out.println(
                "Spiral Order Traversal Of The Tree is :");
        spiralPrint(mt.root);
    }
}

// This code has been contributed by Abhishek Kumar
// Sah(kumarabhisheksah98)

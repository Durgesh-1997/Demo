package OOPSinJAVA;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class OOPSinJAVA.Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}

import Encapsulation.Person;

import java.util.*;
import java.util.Scanner;
//public class OOPSinJAVA.Main{
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the number n: ");
//        int n = scn.nextInt();
//        int digits = 0;
//        int temp = n;
//        while(temp > 0){
//            digits++;
//            temp/=10;
//        }
//        if(n == isArmstrong(n , digits))
//            System.out.println("yes");
//        else
//            System.out.println("no");
//    }
//    public static int power(int a, int b){
//        if(b == 0)return 1;
//        if(b%2 == 0)return power(a , b/2) * power(a , b/2);
//        return a * power(a  , b/2) * power(a , b/2);
//    }
//    public static int isArmstrong(int n , int digits){
//        if(n == 0)return 0;
//        return power(n%10 , digits) + isArmstrong(n/10 , digits);
//    }
//}

import java.util.*;


//public class OOPSinJAVA.Main {
//    static int n;
//    public static boolean solve(int n, int target, int a[], int i, int product) {
//        if (i == n) return (product == target);
//        boolean answer = false;
//
//        product *= a[i];
//
//        answer |= solve(n, target, a, i + 1, product);
//
//        product /= a[i];
//
//        answer |= solve(n, target, a, i + 1, product);
//
//        return answer;
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want and the value of target respectively : ");
//
//        int n = sc.nextInt(), target = sc.nextInt();
//        int a[] = new int[n];
//        System.out.println("Enter the array elements");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println((solve(n, target, a, 0, 1) ? "YES" : "NO"));
//    }
//}


import java.util.*;



//
//public class OOPSinJAVA.Main {
//    public static int totalNQueens(int n) {
//        char board[][] = new char[n][n];
//        for(char i[] : board)
//            Arrays.fill(i, '.');
//        return go(0, board);
//    }
//    public static int go(int col, char board[][]){
//        if(col == board.length) return 1;
//        int count = 0;
//        for(int row = 0; row < board.length; row++){
//            if(isSafe(board, row, col)){
//                board[row][col] = 'Q';
//                count += go(col + 1, board);
//                board[row][col] = '.';
//            }
//        }
//        return count;
//    }
//    public static boolean isSafe(char board[][], int row, int col){
//        int dupRow = row;
//        int dupCol = col;
//
//        while(row >= 0 && col >= 0){
//            if(board[row][col] == 'Q') return false;
//            row--;
//            col--;
//        }
//
//        row = dupRow;
//        col = dupCol;
//        while(col >= 0){
//            if(board[row][col] == 'Q') return false;
//            col--;
//        }
//
//        row = dupRow;
//        col = dupCol;
//        while(col >= 0 && row < board.length){
//            if(board[row][col] == 'Q') return false;
//            row++;
//            col--;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        System.out.println(" Enter Number");
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        System.out.println("The desired answer is : " + totalNQueens(n));
//    }
//}




import java.util.LinkedList;

////public class CheckIfKeyExistsInLinkedList {
////
////    public static void main(String[] args) {
////
////        LinkedList<Integer> linkedList = new LinkedList<>();
////        linkedList.add(6);
////        linkedList.add(21);
////        linkedList.add(17);
////        linkedList.add(30);
////        linkedList.add(10,3);
////        linkedList.add(8);
////
////        int key = 13;
////
////        boolean isKeyPresent = linkedList.contains(key);
////
////        if (isKeyPresent) {
////            System.out.println("Yes");
////        } else {
////            System.out.println("No");
////        }
////    }
//}

import java.util.*;
//
//public class OOPSinJAVA.Main {
//
//    public static void main(String[] args) {
//
//        // Create a new Scanner object
//        Scanner sc = new Scanner(System.in);
//
//        // Create a new Map object
//        Map<String, Integer> map = new HashMap<>();
//
//        // Get the input from the user
//        System.out.println("Enter the key and value pairs: ");
//        while (sc.hasNext()) {
//            String key = sc.next();
//            int value = sc.nextInt();
//            map.put(key, value);
//        }
//
//        // Print the list in sorted order based on key
//        System.out.println("The list in sorted order based on key: ");
//        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//        Collections.sort(list, (e1, e2) -> e1.getKey().compareTo(e2.getKey()));
//        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }
//}

//// Java Code to sort Map by key value
//import java.util.*;
//class sortmapKey {
//
//    // This map stores unsorted values
//    static Map<String, Integer> map = new HashMap<>();
//
//    // Function to sort map by Key
//    public static void sortbykey()
//    {
//        // TreeMap to store values of HashMap
//        TreeMap<String, Integer> sorted = new TreeMap<>();
//
//        // Copy all data from hashMap into TreeMap
//        sorted.putAll(map);
//
//        // Display the TreeMap which is naturally sorted
//        for (Map.Entry<String, Integer> entry : sorted.entrySet())
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//    }
//
//    // Driver Code
//    public static void main(String args[])
//    {
//        // putting values in the Map
//        map.put("Jayant", 80);
//        map.put("Abhishek", 90);
//        map.put("Anushka", 80);
//        map.put("Amit", 75);
//        map.put("Danish", 40);
//
//        // Calling the function to sortbyKey
//        sortbykey();
//    }
//}




//import java.util.ArrayDeque;
//import java.util.Queue;
//
//// A class to store a binary tree node
//class Node
//{
//    int key;
//    Node left = null, right = null;
//
//    Node(int key) {
//        this.key = key;
//    }
//}
//
//class OOPSinJAVA.Main
//{
//    // Function to check if a given binary tree is complete or not
//    public static boolean isComplete(Node root)
//    {
//        // return if the tree is empty
//        if (root == null) {
//            return true;
//        }
//
//        // create an empty queue and enqueue the root node
//        Queue<Node> queue = new ArrayDeque<>();
//        queue.add(root);
//
//        // to store the current node
//        Node front;
//
//        // flag to mark the end of full nodes
//        boolean flag = false;
//
//        // loop till queue is empty
//        while (!queue.isEmpty())
//        {
//            // dequeue front node
//            front = queue.poll();
//
//            // if we have encountered a non-full node before and the current node
//            // is not a leaf, a tree cannot be complete
//            if (flag && (front.left != null || front.right != null)) {
//                return false;
//            }
//
//            // if the left child is empty and the right child exists,
//            // a tree cannot be complete
//            if (front.left == null && front.right != null) {
//                return false;
//            }
//
//            // if the left child exists, enqueue it
//            if (front.left != null) {
//                queue.add(front.left);
//            }
//            // if the current node is a non-full node, set the flag to true
//            else {
//                flag = true;
//            }
//
//            // if the right child exists, enqueue it
//            if (front.right != null) {
//                queue.add(front.right);
//            }
//            // if the current node is a non-full node, set the flag to true
//            else {
//                flag = true;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args)
//    {
//        /* Construct the following tree
//
//                  1
//               /     \
//              2       3
//             /      /   \
//            4      5     6
//
//        */
//
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.right.left = new Node(5);
//        root.right.right = new Node(6);
//
//
//
//        if (isComplete(root)) {
//            System.out.println("Complete binary tree");
//        }
//        else {
//            System.out.println("Not a complete binary tree");
//        }
//    }
//}


//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.Queue;
//
//// A class to store a binary tree node
//class Node
//{
//    int key;
//    Node left = null, right = null;
//
//    Node(int key) {
//        this.key = key;
//    }
//}
//
//class OOPSinJAVA.Main
//{
//    // Function to print reverse level order traversal of a given binary tree
//    public static void reverseLevelOrderTraversal(Node root)
//    {
//        if (root == null) {
//            return;
//        }
//
//        // create an empty queue and enqueue the root node
//        Queue<Node> queue = new ArrayDeque<>();
//        queue.add(root);
//
//        // create a stack to reverse level order nodes
//        Deque<Integer> stack = new ArrayDeque<>();
//
//        // to store the current node
//        Node curr;
//
//        // loop till queue is empty
//        while (!queue.isEmpty())
//        {
//            // process each node in the queue and enqueue their children
//            curr = queue.poll();
//
//            // push the current node into the stack
//            stack.push(curr.key);
//
//            // it is important to process the right node before the left node
//            if (curr.right != null) {
//                queue.add(curr.right);
//            }
//
//            if (curr.left != null) {
//                queue.add(curr.left);
//            }
//        }
//
//        // pop all nodes from the stack and print them
//        while (!stack.isEmpty()) {
//            System.out.print(stack.poll() + " ");
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.right.left = new Node(5);
//        root.right.right = new Node(6);
//        root.right.left.left = new Node(7);
//        root.right.left.right = new Node(8);
//
//        reverseLevelOrderTraversal(root);
//    }
//}




//
//import java.util.HashMap;
//import java.util.Map;
//
//// A class to store a binary tree node
//class Node
//{
//    int key;
//    Node left = null, right = null;
//
//    Node(int key) {
//        this.key = key;
//    }
//}
//
//class OOPSinJAVA.Main
//{
//    // Recursive function to traverse the nodes in a preorder fashion
//    public static void leftView(Node root, int level, Map<Integer, Integer> map)
//    {
//        // base case
//        if (root == null) {
//            return;
//        }
//
//        // if the level is visited for the first time, insert the current node
//        // and level information into the map
//        map.putIfAbsent(level, root.key);
//
//        leftView(root.left, level + 1, map);
//        leftView(root.right, level + 1, map);
//    }
//
//    // Function to print the left view of a given binary tree
//    public static void leftView(Node root)
//    {
//        // create an empty HashMap to store the first node for each level
//        Map<Integer, Integer> map = new HashMap<>();
//
//        // traverse the tree and fill the map
//        leftView(root, 1, map);
//
//        // iterate through the HashMap in sorted order of its keys
//        // and print the left view
//        for (int i = 1; i <= map.size(); i++) {
//            System.out.print(map.get(i) + " ");
//        }
//    }
//                     /*     1
//                        /   \
//                        2     3
//                            /   \
//                            5     6
//                          /   \
//                        7       8
//
//                      */
//    public static void main(String[] args)
//    {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.right.left = new Node(5);
//        root.right.right = new Node(6);
//        root.right.left.left = new Node(7);
//        root.right.left.right = new Node(8);
//
//        leftView(root);
//    }
//}



//
//import java.util.HashMap;
//import java.util.Map;
//
//// A class to store a binary tree node
//class Node
//{
//    int key;
//    Node left = null, right = null;
//
//    Node(int key) {
//        this.key = key;
//    }
//}
//
//class OOPSinJAVA.Main
//{
//    // Recursive function to traverse the nodes in a preorder fashion
//    public static void leftView(Node root, int level, Map<Integer, Integer> map)
//    {
//        // base case
//        if (root == null) {
//            return;
//        }
//
//        // if the level is visited for the first time, insert the current node
//        // and level information into the map
//        map.putIfAbsent(level, root.key);
//
//        leftView(root.left, level + 1, map);
//        leftView(root.right, level + 1, map);
//    }
//
//    // Function to print the left view of a given binary tree
//    public static void leftView(Node root)
//    {
//        // create an empty HashMap to store the first node for each level
//        Map<Integer, Integer> map = new HashMap<>();
//
//        // traverse the tree and fill the map
//        leftView(root, 1, map);
//
//        // iterate through the HashMap in sorted order of its keys
//        // and print the left view
//        for (int i = 1; i <= map.size(); i++) {
//            System.out.print(map.get(i) + " ");
//        }
//    }
//    /*      1
//         /     \
//       2         3
//        \        /
//        4        5
//     */
//    public static void main(String[] args)
//    {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.right = new Node(4);
//        root.right.left = new Node(5);
//
//
//
//        leftView(root);
//    }
//}


//
////import java.util.HashMap;
////import java.util.Map;
//// A class to store a binary tree node
//class Node
//{
//    int data;
//    Node left = null, right = null;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class OOPSinJAVA.Main
//{
//    // Function to perform preorder traversal on a given binary tree
//    public static void preorder(Node root)
//    {
//        if (root == null) {
//            return;
//        }
//
//        System.out.print(root.data + " ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//
//    // Utility function to swap left subtree with right subtree
//    public static void swap(Node root)
//    {
//        if (root == null) {
//            return;
//        }
//
//        Node temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//    }
//
//    // Function to convert a given binary tree into its mirror
//    public static void convertToMirror(Node root)
//    {
//        // base case: if the tree is empty
//        if (root == null) {
//            return;
//        }
//
//        // convert left subtree
//        convertToMirror(root.left);
//
//        // convert right subtree
//        convertToMirror(root.right);
//
//        // swap left subtree with right subtree
//        swap(root);
//    }
//
//    public static void main(String[] args)
//    {
//        /* Construct the following tree
//                  1
//                /   \
//               /     \
//              2       3
//             / \     / \
//            4   5   6   7
//        */
//
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//        convertToMirror(root);
//        preorder(root);
//    }
//}


//
//class OOPSinJAVA.Main {
//
//    public static void main(String args[]) {
//
//        Person[] p = new Person[2];
//
//        for (int i = 0; i < p.length; i++) {
//
//            System.out.print(p[i] +" ");
//
//        }
//
//    }
//
//}
//
//
//
//class Person {
//
//    String name = "A";
//
//
//
//    public Person(String name) {
//
//        this.name = name;
//
//    }
//
//}




import java.io.*;

import java.util.*;

//public class OOPSinJAVA.Main{
//
//    public static void main(String args[]){
//
//        int[][] arr = { {3,2,1},{1,2,3} };
//
//        int value = 0;
//
//        for (int row = 1; row < arr.length; row++) {
//
//            for (int col = 1; col < arr[0].length; col++) {
//
//                if (arr[row][col] % 2 == 1){
//
//                    arr[row][col] = arr[row][col] + 1;
//
//                }
//
//                if (arr[row][col] % 2 == 0){
//
//                    arr[row][col] = arr[row][col] * 2;
//
//                }
//
//            }
//
//        }
//
//
//
//        for(int i=0;i < arr.length;i++){
//
//            for(int j=0 ; j< arr[0].length ; j++){
//
//                System.out.print(arr[i][j]);
//
//                System.out.print(" ");
//
//            }
//
//            System.out.println("");
//
//        }
//
//    }
//
//}

// Encapsulation
public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}


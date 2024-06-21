package Heap;

// Java approach
import java.util.*;

// Class for each node in the Binomial Heap
class Node {
    public int value;
    public Node parent;
    public List<Node> children;
    public int degree;
    public boolean marked;

    public Node(int val) {
        value = val;
        parent = null;
        children = new ArrayList<>();
        degree = 0;
        marked = false;
    }
}

// Class for the Binomial Heap data structure
class BinomialHeap {
    public List<Node> trees;
    public Node min_node;
    public int count;

    // Constructor for the Binomial Heap
    public BinomialHeap() {
        min_node = null;
        count = 0;
        trees = new ArrayList<>();
    }

    // Check if the heap is empty
    public boolean is_empty() {
        return min_node == null;
    }

    // Insert a new value into the heap
    public void insert(int value) {
        Node node = new Node(value);
        BinomialHeap heap = new BinomialHeap();
        heap.trees.add(node);
        merge(heap);
    }

    // Get the minimum value in the heap
    public int get_min() {
        return min_node.value;
    }

    // Extract the minimum value from the heap
    public int extract_min() {
        Node minNode = min_node;
        trees.remove(minNode);
        BinomialHeap heap = new BinomialHeap();
        heap.trees = minNode.children;
        merge(heap);
        _find_min();
        count -= 1;
        return minNode.value;
    }

    // Merge two binomial heaps
    public void merge(BinomialHeap other_heap) {
        trees.addAll(other_heap.trees);
        count += other_heap.count;
        _find_min();
    }

    // Find the minimum value in the heap
    public void _find_min() {
        min_node = null;
        for (Node tree : trees) {
            if (min_node == null || tree.value < min_node.value) {
                min_node = tree;
            }
        }
    }

    // Decrease the key of a node
    public void decrease_key(Node node, int new_value) {
        if (new_value > node.value) {
            throw new IllegalArgumentException("New value is greater than the current value");
        }
        node.value = new_value;
        _bubble_up(node);
    }

    // Delete a specific node from the heap
    public void delete_node(Node node) {
        decrease_key(node, Integer.MIN_VALUE);
        extract_min();
    }

    // Perform the bubbling up operation
    public void _bubble_up(Node node) {
        Node parent = node.parent;
        while (parent != null && node.value < parent.value) {
            int temp = node.value;
            node.value = parent.value;
            parent.value = temp;
            node = parent;
            parent = node.parent;
        }
    }

    // Link two trees together
    public void _link(Node tree1, Node tree2) {
        if (tree1.value > tree2.value) {
            Node temp = tree1;
            tree1 = tree2;
            tree2 = temp;
        }
        tree2.parent = tree1;
        tree1.children.add(tree2);
        tree1.degree += 1;
    }

    // Consolidate the trees in the heap
    public void _consolidate() {
        int max_degree = (int) Math.floor(Math.log(count) / Math.log(2)) + 1;
        Node[] degree_to_tree = new Node[max_degree + 1];

        while (!trees.isEmpty()) {
            Node current = trees.get(0);
            trees.remove(0);
            int degree = current.degree;
            while (degree_to_tree[degree] != null) {
                Node other = degree_to_tree[degree];
                degree_to_tree[degree] = null;
                if (current.value < other.value) {
                    _link(current, other);
                } else {
                    _link(other, current);
                    current = other;
                }
                degree++;
            }
            degree_to_tree[degree] = current;
        }

        min_node = null;
        trees.clear();
        for (Node tree : degree_to_tree) {
            if (tree != null) {
                trees.add(tree);
                if (min_node == null || tree.value < min_node.value) {
                    min_node = tree;
                }
            }
        }
    }

    // Get the size of the heap
    public int size() {
        return count;
    }

    public static void main(String[] args) {
        BinomialHeap BH = new BinomialHeap();
        BH.insert(10);
        BH.insert(115);
        System.out.println(BH);
    }
}

// This code is contributed by Susobhan Akhuli


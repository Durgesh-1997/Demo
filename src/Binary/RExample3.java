package Binary;

import java.util.*;
//Method 3: ( Using a Hash_Map)
// Definition of a binary tree node


class RExample3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    // Recursive function to traverse the binary
    // tree and add nodes to the hashmap
    static void addNodesToMap(Node node, int level, Map<Integer, List<Integer>> nodeMap) {
        if (node == null) {
            return;
        }
        // Add the current node to the list of
        // nodes at its level in the hashmap
        if (!nodeMap.containsKey(level)) {
            nodeMap.put(level, new ArrayList<>());
        }
        nodeMap.get(level).add(node.data);
        // Recursively traverse the left and
        // right subtrees
        addNodesToMap(node.left, level + 1, nodeMap);
        addNodesToMap(node.right, level + 1, nodeMap);
    }

    static List<Integer> reverseLevelOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        // Create a map to store the nodes at each level of the binary tree
        Map<Integer, List<Integer>> nodeMap = new HashMap<>();
        // Traverse the binary tree recursively and
        // add nodes to the hashmap
        addNodesToMap(root, 0, nodeMap);
        // Iterate over the hashmap in reverse order of the
        // levels and add nodes to the result list
        for (int level = nodeMap.size() - 1; level >= 0; level--) {
            List<Integer> nodesAtLevel = nodeMap.get(level);
            for (int i = 0; i < nodesAtLevel.size(); i++) {
                result.add(nodesAtLevel.get(i));
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args) {
        // Create the binary tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        // Find the reverse level order traversal
        // of the binary tree
        List<Integer> result = reverseLevelOrder(root);
        System.out.println("Level Order traversal of binary tree is:");
        // Print the result
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }
}
// This code is contributed by Veerendra_Singh_Rajpoot

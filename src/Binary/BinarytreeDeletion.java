package Binary;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class BinaryTreeDeletion {
    private TreeNode root;

    public BinaryTreeDeletion() {
        root = null;
    }

    // Function to insert a new node
    public void insert(int val) {
        root = insertNode(root, val);
    }

    private TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else if (val > root.val) {
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    // Function to delete a node
    public void delete(int val) {
        root = deleteNode(root, val);
    }

    private TreeNode deleteNode(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        if (val < root.val) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.val) {
            root.right = deleteNode(root.right, val);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    // Function to find minimum value in a tree rooted at given node
    private int minValue(TreeNode root) {
        int minVal = root.val;
        while (root.left != null) {
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }

    // Function to traverse the binary tree in-order
    public void inorder() {
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeDeletion tree = new BinaryTreeDeletion();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder();
        System.out.println();

        tree.delete(20);
        System.out.println("Inorder traversal after deletion of 20:");
        tree.inorder();
        System.out.println();

        tree.delete(30);
        System.out.println("Inorder traversal after deletion of 30:");
        tree.inorder();
        System.out.println();
    }
}

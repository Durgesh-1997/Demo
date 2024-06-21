package LinkedList;

class LinkedList1 {
    Node head; // head of list
    Node slow_ptr, fast_ptr, second_half;

    class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    boolean isPalindrome(Node head)	{
        slow_ptr = head;
        fast_ptr = head;
        Node prev_of_slow_ptr = head;
        Node midnode = null; // To handle odd size list
        boolean res = true; // initialize result

        if (head != null && head.next != null) {

            while (fast_ptr != null
                    && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }

            if (fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            second_half = slow_ptr;
            prev_of_slow_ptr.next = null;
            reverse();
            res = compareLists(head , second_half);
            reverse();

            if (midnode != null) {
                prev_of_slow_ptr.next = midnode;
                midnode.next = second_half;
            }
            else
                prev_of_slow_ptr.next = second_half;
        }
        return res;
    }
    void reverse(){
        Node prev = null;
        Node current = second_half;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        second_half = prev;
    }

    boolean compareLists(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }

        if (temp1 == null && temp2 == null)
            return true;
        return false;
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args){
        LinkedList1 llist = new LinkedList1();

        int arr[] = { 1, 2, 4, 5, 4, 2, 1 };
        for (int i = 0; i < 7; i++) {
            llist.push(arr[i]);
        }
        if (llist.isPalindrome(llist.head) != false) {
            System.out.println("Is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

//import java.util.Scanner;
//
//public class Palindrome {
//
//    static class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public static boolean isPalindrome(Node head) {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        Node head1 = head;
//        Node head2 = reverse(slow);
//
//        while (head1 != null && head2 != null) {
//            if (head1.data != head2.data) {
//                return false;
//            }
//            head1 = head1.next;
//            head2 = head2.next;
//        }
//
//        return true;
//    }
//
//    public static Node reverse(Node head) {
//        Node prev = null;
//        Node curr = head;
//        Node next = null;
//
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        return prev;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        Node head = null;
//
//        while (n-- > 0) {
//            int data = sc.nextInt();
//            Node newNode = new Node(data);
//            newNode.next = head;
//            head = newNode;
//        }
//
//        System.out.println(isPalindrome(head));
//    }
//}


//
//import java.util.Scanner;
//
//public class Palindrome {
//
//    static class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public static boolean isPalindrome(Node head) {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        // Recursion.Reverse the second half of the linked list
//        Node prev = null;
//        Node curr = slow;
//        while (curr != null) {
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        // Compare the first and second half of the linked list
//        boolean isPalindrome = true;
//        while (slow != null) {
//            if (slow.data != prev.data) {
//                isPalindrome = false;
//                break;
//            }
//            slow = slow.next;
//            prev = prev.next;
//        }
//
//        return isPalindrome;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Read the linked list from the user
//        System.out.println("Enter the linked list: ");
//        String input = sc.nextLine();
//        String[] tokens = input.split(" ");
//
//        // Create a linked list from the user input
//        Node head = null;
//        for (String token : tokens) {
//            Node newNode = new Node(Integer.parseInt(token));
//            newNode.next = head;
//            head = newNode;
//        }
//
//        // Check if the linked list is a palindrome
//        boolean isPalindrome = isPalindrome(head);
//        System.out.println("Is the linked list a palindrome? " + isPalindrome);
//    }
//}


//import java.util.Scanner;
//
//public class Palindrome {
//
//    public static boolean isPalindrome(Node head) {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        // Recursion.Reverse the second half of the linked list
//        Node prev = null;
//        while (slow != null) {
//            Node next = slow.next;
//            slow.next = prev;
//            prev = slow;
//            slow = next;
//        }
//
//        // Compare the first and second halves of the linked list
//        boolean isPalindrome = true;
//        while (prev != null) {
//            if (prev.data != head.data) {
//                isPalindrome = false;
//                break;
//            }
//            prev = prev.next;
//            head = head.next;
//        }
//
//        return isPalindrome;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the linked list from the user
//        System.out.println("Enter the linked list: ");
//        String input = scanner.nextLine();
//        Node head = null;
//        for (String token : input.split(" ")) {
//            int data = Integer.parseInt(token);
//            Node node = new Node(data);
//            node.next = head;
//            head = node;
//        }
//
//        // Check if the linked list is a palindrome
//        boolean isPalindrome = isPalindrome(head);
//        System.out.println("Is the linked list a palindrome? " + isPalindrome);
//    }
//}
//
//class Node {
//
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}


package LinkedList;

class SingyLinkedList {
    Node head; // head of the list

    // Method to insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Method to insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to delete a node by key
    public void deleteByKey(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) { // If head node itself holds the key
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) { // Search for the key to be deleted
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return; // If key was not present in linked list
        prev.next = temp.next; // Unlink the node from linked list
    }

    // Method to print the linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    // Method to search for an element in the linked list
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        SingyLinkedList list = new SingyLinkedList();

        // Insert elements
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAtEnd(3);

        System.out.println("Linked list:");
        list.printList();

        // Delete by key
        list.deleteByKey(2);
        System.out.println("Linked list after deleting node with data 2:");
        list.printList();

        // Search for an element
        boolean found = list.search(3);
        System.out.println("Is 3 in the list? " + found);
    }
}

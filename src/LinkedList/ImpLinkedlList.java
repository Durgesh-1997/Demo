package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ImpLinkedList {
    Node head;

    public ImpLinkedList() {
        this.head = null;
    }

    // Insert a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Insert a new node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node with a given key
    public void delete(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    // Print the elements of the list
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ImpLinkedList list = new ImpLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.print("Original List: ");
        list.printList();

        list.prepend(0);
        System.out.print("After Prepending 0: ");
        list.printList();

        list.delete(2);
        System.out.print("After Deleting 2: ");
        list.printList();
    }
}
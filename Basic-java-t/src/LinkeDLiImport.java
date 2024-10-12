import java.util.LinkedList;
class LinkeDLiImport {
    Node head;  // Head of the list

    // Node class for a singly linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the linked list iteratively
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next; // Store next node
            currNode.next = prevNode;      // Reverse current node's pointer
            prevNode = currNode;           // Move prevNode one step forward
            currNode = nextNode;           // Move currNode one step forward
        }
        head = prevNode;  // Update head to the last node
    }

    // Recursive method to reverse the linked list
    public Node reverseListRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Method to add an element at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkeDLiImport list = new LinkeDLiImport();

        // Add elements to the list
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        // Print the original list
        System.out.println("Original List:");
        list.printList();

        // Reverse the list iteratively
        list.reverseList();
        System.out.println("Reversed List (Iterative):");
        list.printList();

        // Reverse the list recursively
        list.head = list.reverseListRecursive(list.head);
        System.out.println("Reversed List (Recursive):");
        list.printList();
    }
}


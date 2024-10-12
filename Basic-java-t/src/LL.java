public class LL {
    Node head;
    private int size;

    LL(){
        this.size= 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
// add list on first position
    public void addFirst(String data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         // if head is not null
        newNode.next = head;
         head = newNode;
    }
// add last position
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
//print
    public void printList(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+ " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null ");
    }
//    delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        size--;
        head = head.next;
    }
    public void deletLast(){
        if(head == null){
            System.out.println("List is empty");
        }
        size--;
        if(head.next == null){      // head.next = null -> last Node = null
            head = null;            // null.next
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deletLast();
        list.printList();

//        list.deletLast();
//        list.printList();

        //list.getSize();
        System.out.println("list size: "+(list.getSize()));

        list.addFirst("It");
        list.printList();
        System.out.println("list size: "+(list.getSize()));

    }
}

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    public void addFirst (int data){
        //Step 1 Create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step2 new node next - head
        newNode.next = head;

        // Step3 head = new Node
        head = newNode;

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.addFirst(1);
        ll.addFirst(2);
    }
}

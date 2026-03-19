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
    public static int size;

    public void addFirst (int data){
        //Step 1 Create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step2 new node next - head
        newNode.next = head;

        // Step3 head = new Node
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printLList(){
        if(head == null){
            System.out.println("LinkedList is empty.");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.printLList();
        ll.addFirst(2);
        // ll.printLList();
        ll.addFirst(1);
        // ll.printLList();
        ll.addLast(3);
        // ll.printLList();
        ll.addLast(4);
        ll.add(2, 9);
        ll.printLList();
        System.out.println("Size of my Linked List : " + size);
    }
}

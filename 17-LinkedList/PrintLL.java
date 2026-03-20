class Node{
    int data;
    Node next;
    public Node(int newData){
        this.data = newData;
        this.next = null;
    }
}


public class PrintLL {
    
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node temp  = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

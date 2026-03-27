public class QueueWithLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class LQueue {
        static Node head = null;
        static Node tail = null;
        
        public boolean isEmpty() {
            return head == null & tail == null;
        }

        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            }else {
                head = head.next;
            }
            return front;
        }
        public int peek () {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        LQueue q = new LQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
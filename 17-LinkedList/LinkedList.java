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

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Iterative search in Linked List
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    //recursive search in linked list
    public int recSearch(int key, int i){
        return helper(head, key);
    }

    //Reverse linked list
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //delete nth node from end
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        if(n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //find mid of the linked list
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Step1 to find mid node
        Node midNode = findMid(head);

        // Step 2 to reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        //check left half == right half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }


    //Detect cycle in linked list
    public static boolean isCycle(){ //floyds cycle finding algorithm
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //Detect cycle
        isCycle();
        Node slow = head;
        Node fast = head;
        Node prev = null;
        Boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        slow = head;

        //Find Meeting Point
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last
        prev.next = null;

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
        // LinkedList ll = new LinkedList();
        // ll.printLList();
        // ll.addFirst(1);
        // ll.printLList();
        // ll.addFirst(2);
        // ll.printLList();
        // ll.addLast(2);
        // ll.printLList();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.add(2, 9);
        // ll.printLList();

        // System.out.println("Size of my Linked List : " + size);

        // To remove linked list
        // ll.removeFirst();
        // ll.printLList();

        // ll.removeLast();
        // ll.printLList();
        // System.out.println(size);

        // Iterative search function
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(310));

        // Recursive search
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(310));

        //Reverse Linked list function
        // ll.reverse();
        // ll.printLList();

        //delete nth node from last 
        // ll.deleteNthFromEnd(3);
        // ll.printLList();

        //check palindrome
        // System.out.println(ll.checkPalindrome());

        //detect cycle from the linked list
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head .next.next= new Node(3);
        head .next.next.next= temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}

public class CircularQueueUsingArr {
    static class CQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        CQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;    
            front = -1;        
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add
        public void add(int data) {
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Add first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];

            // last element delete

            if(rear == front) {
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }

            return result;
        }
        public int peek() {
            if(rear == -1){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        CQueue q = new CQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
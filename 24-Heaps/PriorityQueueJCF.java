import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueJCF {

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // This line is used to give priority to larger numbers
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(4);
        pq.add(3);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
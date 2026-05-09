import java.util.*;
import java.util.LinkedList;

public class MaxEleInAWindow {

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        // First window
        for (int i = 0; i < k; i++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        // Remaining windows
        for (int i = k; i < nums.length; i++) {

            // Add max of previous window
            res.add(nums[dq.peekFirst()]);

            // Remove elements not part of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        // Add max of last window
        res.add(nums[dq.peekFirst()]);

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        List<Integer> ans = maxSlidingWindow(nums, k);

        System.out.println(ans);
    }
}
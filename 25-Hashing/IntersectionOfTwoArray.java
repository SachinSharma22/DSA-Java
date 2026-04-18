import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArray {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums2) {
            if(set1.contains(num)) {
                resultSet.add(num);
            }
        }

        //convert set to array
        int result[] = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
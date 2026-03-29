public class StoneAndHammer {
    public static int maxStone(int[] arr, int m) {
        int maxStone = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int currVal = arr[i] + arr[j];
                if(currVal % m == 0) {
                    maxStone = Math.max(maxStone, currVal);
                }
            }
        }
        return maxStone;
    }
    public static void main(String[] args) {
        int arr[] = {30,14,15,40,19};
        int m = 2;
        System.out.println(maxStone(arr, m));
    }
}

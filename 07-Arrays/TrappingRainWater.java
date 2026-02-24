public class TrappingRainWater {
    public static int trappedRainWater2(int[] height){
        if(height == null || height.length < 3){
            return 0;
        }
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        int rightMax[] = new int[n];
        int k = n;
        rightMax[k-1] = height[k-1];
        int m = 2;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
            rightMax[k-m] = Math.max(height[k-m], rightMax[k-m+1]);
            m++;
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static int trappedRainWater(int[] height){
        if (height == null || height.length < 3) {
            return 0;
        }
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        // Calculate left max boundary
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel -height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        int trappedWater = trappedRainWater2(arr);
        System.out.println("Total water trapped is: " + trappedWater);
    }
}

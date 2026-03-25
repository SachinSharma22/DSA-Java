import java.util.Stack;

public class NextGreaterEleL {
    public static void nextSmallerRight(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGrL = new int[arr.length];
        
         for(int i =arr.length -1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nextGrL[i] = -1;
            }else{
                nextGrL[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nextGrL.length; i++) {
            System.out.print(nextGrL[i] + " ");
        }
    }
    public static void nextSmall(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGrL = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nextGrL[i] = -1;
            }else{
                nextGrL[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nextGrL.length; i++) {
            System.out.print(nextGrL[i] + " ");
        }
    }
    public static void nextGreaterL(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGrL = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nextGrL[i] = -1;
            }else{
                nextGrL[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nextGrL.length; i++) {
            System.out.print(nextGrL[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        // nextGreaterL(arr);

        // This function is to find next smaller element in the left side of the array
        // nextSmall(arr);

        // This function is to find next smaller element in the right side of the array
        nextSmallerRight(arr);
    }
}

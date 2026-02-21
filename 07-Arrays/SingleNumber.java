public class SingleNumber {
    public static int findUnique(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                count ++;
                }
                
            }
            if(count == 1){
                    return arr[i];
                }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,4,1,6,2,1,2,5};
        int uniqueNumber = findUnique(arr);
        System.out.println(uniqueNumber + " is unique in given array.");
    }
}

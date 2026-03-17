public class SortArrConsisting0sAnd1s {
    public static void sortArr(int[] arr){
        if(arr.length == 0){
            System.out.println("Enter some value first");
            return;
        }
        int lp = 0;
        int rp = arr.length-1;
        while (lp < rp) {
            if(arr[rp] == 0 && arr[lp] == 1){
                int temp = arr[rp];
                arr[rp] = arr[lp];
                arr[lp] = temp;
                lp++;
                rp--;
            }

            if(arr[rp] == 1){
                rp--;
            }
            if(arr[lp] == 0){
                lp++;
            }
        }
        printArr(arr);
    }
    public static void printArr( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,0,0,1,1,0,0};
        sortArr(arr);
    }
}

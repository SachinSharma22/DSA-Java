package basicsortingalogs;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltReversedSort {
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,2,3};
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
       }
    }
}

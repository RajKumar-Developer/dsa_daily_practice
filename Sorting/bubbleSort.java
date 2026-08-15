package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,4,7,3,5,2,1,6};
        System.out.println(Arrays.toString(bruteBubbleSort(arr)));
    }
    public void bubbleSortopt(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {  //Use two nested loops to iterate over the array
            boolean didSwap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];  //Swap arr[j+1] with arr[i]
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }
    }
    private static int[] bruteBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {   //7 6 5 4 3 2 1 0
            for (int j = 0; j <= i - 1; j++) {//0->[7-1],0->[6-1],0->[5-1],0->[4-1],0->[3-1],0->[2-1],0->[1-1]
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];  //Swap arr[j+1] with arr[i];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

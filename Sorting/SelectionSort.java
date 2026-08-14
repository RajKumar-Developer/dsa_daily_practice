package Sorting;

import java.util.Arrays;

// Selection Sort Algorithm
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9,4,6,1,8,2,5};
        int[]res = selectionSort(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] selectionSort(int[] arr) {
       int n=arr.length;
       for(int i=0;i<n;i++){
        int minIndex=i;
        for(int j=i+1;j<n;j++){
            // System.out.print(i+":"+arr[minIndex]+" "+j+":"+arr[j]+Arrays.toString(arr)+"\n");
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }
        int temp = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
       }
       return arr;
    }
}

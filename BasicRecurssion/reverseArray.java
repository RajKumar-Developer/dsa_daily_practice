package BasicRecurssion;

import java.util.*;

// Reverse a given Array
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(Arrays.toString(bruteForce(arr))+"brute force Approach");
        System.out.println(Arrays.toString(betterApproach(arr))+"better Approach");
        buildInApproach(list);
        System.out.println(list.toString()+"build In approach");
    }
    public static void buildInApproach(List<Integer> list){//TC:O(N) SC:O(1)
        Collections.reverse(list);
    }
    public static int[] betterApproach(int[] arr){//TC:O(N) SC:O(1)
        int n= arr.length;
        int p1=0;
        int p2=n-1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1+=1;
            p2-=1;
        }
        return arr;
    }
    public static int[] bruteForce(int[] arr){//time complexity:O(N) & Space Complexity :O(N)
        int n= arr.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i]=arr[n-1-i];
        }
        return res;
    }

}

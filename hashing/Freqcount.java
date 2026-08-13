package hashing;

import java.util.*;

// Count frequency of each element in the array
public class Freqcount {
    public static void main(String[] args) {
        int[] arr = {5,10,5,15,10,5,2};
        // countTheFrequencyBrute(arr);
        frequencyMap(arr);
    }

    private static void frequencyMap(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }

    private static void countTheFrequencyBrute(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;//make this to check with j
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }

}

package hashing;
//Find the highest/lowest frequency element

import java.util.*;
public class getHighLowFreq {
    public static void main(String[] args) {
        int[] arr = {5,10,5,15,10,5,2};
        MinMaxfrequency(arr);
    }

    private static void MinMaxfrequency(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int maxOcc=0,minOcc=arr.length;
        int maxEle=0,minEle=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>maxOcc){
                maxOcc=m.getValue();
                maxEle=m.getKey();
            }
            if(m.getValue()<minOcc){
                minOcc=m.getValue();
                minEle=m.getKey();
            }
        }
        System.out.println("min Occuring number:"+minEle+"::"+minOcc+"\nmax Occuring number:"+maxEle+"::"+maxOcc);
    }
}

package BasicMathQuestions;

import java.util.ArrayList;
import java.util.Arrays;

//Print all Divisors of a given Number
// Input: N = 36
// Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
// Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
// Input: N = 12
// Output: [1, 2, 3, 4, 6, 12]
// Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
public class getAllDivisors {
    public static void main(String[] args) {
        int num=12;
        Integer[] arr = printAllDivisor(num);
        System.out.println(Arrays.toString(arr));
    }

    private static Integer[] printAllDivisor(int num) {
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i=1;i<=num;i++){
        if(num%i==0){
            arr.add(i);
        }
       }
       return arr.toArray(new Integer[0]);
    }
}

package BasicRecurssion;

import java.util.ArrayList;

// Print Fibonacci Series up to Nth term
public class PrintNthFibb {
    public static void main(String[] args) {
        System.out.println(fib(4));
        bruteforcefib(4);
    }
    public static void bruteforcefib(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i=2;i<=n;i++){
            arr.add(arr.get(i-1)+arr.get(i-2));
        }
        System.out.println(arr);
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}

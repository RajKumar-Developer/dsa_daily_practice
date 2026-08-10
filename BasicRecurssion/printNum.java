package BasicRecurssion;
// Print 1 to N using Recursion
public class printNum {
    public static void main(String[] args) {
        forwardPrint(5);
        System.out.println();
        backwardPrint(5);
    }

    private static void backwardPrint(int num) {
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        backwardPrint(num-1);
    }

    private static void forwardPrint(int num) {
        if(num==0){
            return;
        }
        forwardPrint(num-1);
        System.out.print(num+" ");    
    }
}

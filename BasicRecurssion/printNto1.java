package BasicRecurssion;
// Print N to 1 using Recursion
public class printNto1 {
    public static void main(String[] args) {
        forwardPrint(10);
        System.out.println();
        backwardPrint(10);
    }

    private static void backwardPrint(int num) {
         if(num<=0){
            return;
        }
        backwardPrint(num-1);
        System.out.print(num+" ");
    }

    private static void forwardPrint(int num) {
        if(num<=0){
            return;
        }
        System.out.print(num+" ");
        forwardPrint(num-1);
    }
}

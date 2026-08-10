package BasicRecurssion;
// Print Name N times using Recursion
public class printNamesNtimes {
    public static void main(String[] args) {
        printNames(5);
    }

    private static void printNames(int n) {
        if(n==0){
            return;
        }
        printNames(n-1);
        System.out.print("Rajkumar ");
    }
}

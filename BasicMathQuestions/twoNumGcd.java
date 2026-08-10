// Find GCD of two numbers
// Example 1:
// Input: N1 = 9, N2 = 12

// Output: 3

// Explanation:
// Factors of 9: 1, 3, 9
// Factors of 12: 1, 2, 3, 4, 6, 12
// Common Factors: 1, 3
// Greatest common factor: 3 (GCD)

// Example 2:
// Input: N1 = 20, N2 = 15

// Output: 5

// Explanation:
// Factors of 20: 1, 2, 4, 5, 10, 20
// Factors of 15: 1, 3, 5, 15
// Common Factors: 1, 5
// Greatest common factor: 5 (GCD)
package BasicMathQuestions;

public class twoNumGcd {
    public static void main(String[] args) {
        int res = GcdOfTwoNumbers(20,15);
        System.out.println(res);
    }

    private static int gcdBruteForce(int a,int b){
        int gcd = 1;
        for(int i=1;i<Math.min(a, b);i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    private static int GcdOfTwoNumbers(int a, int b) {
        while(a>0 && b>0){
            if(a>b){
                a=a-b;
                
            }else{
                b=b-a;
            }
        }
        if(a>0){
            return a;
        }else{
            return b;
        }
    }
}

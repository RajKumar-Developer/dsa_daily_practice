package BasicMathQuestions;
// Check if a number is prime or not
public class checkPrime {
    public static void main(String[] args) {
        int num=8;
        boolean res = isPrime(num);
        isPrimeBruteforce(num);
        if(res){
            System.out.println("isprime");
        }else{
            System.out.println("not a prime");
        }
    }

    private static boolean isPrimeBruteforce(int num) {
       for(int i=2;i<num;i++){
        if(num%i==0){
            return false;
        }
       }
       return true;
    }

    private static boolean isPrime(int num) {
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}

package BasicMathQuestions;

public class checkPalindrome {
    public static void main(String[] args) {
        boolean res = isPalindrome(455534);
        if(res){
            System.out.println("Is a Palindrome");
        }else{
            System.out.println("Isn't a Palindrome");
        }
    }

    private static boolean isPalindrome(int num) {
        int rem=0,rev=0,n=num;
        while (num!=0) {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev==n;
    }
}

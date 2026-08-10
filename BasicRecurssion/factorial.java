package BasicRecurssion;
//Factorial of a Number : Iterative and Recursive
public class factorial {
    public static void main(String[] args) {
        int num=5;
        bruteforce(num);
        int factres = recursiveFact(num);
        System.out.println(factres);
    }

    private static int recursiveFact(int num) {
        if(num==0){
            return 1;
        }
        return num*recursiveFact(num-1);
    }

    private static void bruteforce(int num) {
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}

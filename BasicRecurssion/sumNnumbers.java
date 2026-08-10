package BasicRecurssion;
// Sum of first N Natural Numbers
public class sumNnumbers {
    public static void main(String[] args) {
        int num=6;
        System.out.println("brute Force");
        BruteforceSum(num);
        System.out.println("formulae used");
        formulaSum(num);
        System.out.println("recurssive solution");
        System.out.println(recurssiveSum(num));

    }

    private static int recurssiveSum(int num) {
        if(num==1){
            return 1;
        }
        return num+recurssiveSum(num-1);
    }

    private static void formulaSum(int num) {
        System.out.println(((num)*(num+1))/2);
    }

    private static void BruteforceSum(int num) {
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

package BasicMathQuestions;
// Check if a number is Armstrong Number or not
public class checkAmstrong {
    public static void main(String[] args) {
        int num=157;
        boolean res = amstrongNumber(num);
        if(res){
            System.out.println(num+" is a Amstrong num");
        }else{
            System.out.println(num+" is not a Amstrong num");
        }
    }

    private static boolean amstrongNumber(int num) {
        int sum=0,rem=0,n=num;
        int pow =(int)Math.log10(num)+1;
        while(num!=0){
            rem=num%10;
            sum=sum+(int)(Math.pow(rem, pow));
            num = num/10;
        }
        return sum==n;
    }
}

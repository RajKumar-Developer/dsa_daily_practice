package BasicMathQuestions;
public class countAllDigits{
    public static void main(String[] args) {
        int count=countNumberBruteForce(1234567);
        System.out.println(count);
    }

    private static int countNumberBruteForce(int num) {
        int count =0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }

}
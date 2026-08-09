package BasicMathQuestions;
public class countAllDigits{
    public static void main(String[] args) {
        int count=countNumberBruteForce(1234567);
        int count2=countNumberOptimal(12345);
        System.out.println(count+" "+count2);
    }

    private static int countNumberOptimal(int i) {
        int count = (int)Math.log10(i)+1;
        return count;
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
// Pattern-18: Alpha-Triangle Pattern
public class pattern18 {

    public static void main(String[] args) {
        alphaTrianglePattern(5);
    }

    private static void alphaTrianglePattern(int n) {
        for(int i=0;i<n;i++){
            char ch='E';
            ch=(char)(ch-i);
            for(int j=0;j<i+1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

// Pattern-19: Symmetric-Void Pattern
public class pattern19 {
    public static void main(String[] args) {
        symmetricVoidPattern(5);
    }

    private static void symmetricVoidPattern(int n) {
        for(int i=0;i<2*n;i++){
            //lefttop
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //topmidspace
            // for(int j=0;j<)
            System.out.println();
        }
    }
}

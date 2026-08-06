// Pattern - 21: Hollow Rectangle Pattern
// **********
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// **********
public class patter21 {
    public static void main(String[] args) {
        hollowRectanglePattern(10);
    }

    private static void hollowRectanglePattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=1 && j>=1 && i<n-1 && j<n-1){
                    System.out.print(' ');
                }else{
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}

// Pattern-19: Symmetric-Void Pattern
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
public class pattern19 {
    public static void main(String[] args) {
        symmetricVoidPattern(5);
    }

    private static void symmetricVoidPattern(int n) {
        //upper pattern
        for(int i=0;i<n;i++){
            //lefttop
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //topmidspace
            for(int j=0;j<2*i;j++){
                System.err.print(" ");
            }
            //toprightspace
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower pattern
        for(int i=0;i<n;i++){
            //bottomLeft;
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            //bottomMid
            for(int j=0;j<2*(n-i)-2;j++){
                System.out.print(" ");
            }
            //bottomRight
            for(int j=0;j<i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

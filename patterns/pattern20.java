// Pattern - 20: Symmetric-Butterfly Pattern
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
public class pattern20 {
    public static void main(String[] args) {
        symmetricButterflyPattern(5);
    }

    private static void symmetricButterflyPattern(int n) {
        //top
        for(int i=0;i<n;i++){
            //topleft
            for(int j=0;j<i+1;j++){
                System.out.print('*');
            }
            //topmidSpace
            for(int j=0;j<2*(n-i)-2;j++){
                System.out.print(' ');
            }
            //topleft
            for(int j=0;j<i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            //bottomleft
            for(int j=0;j<n-(i+1);j++){
                System.out.print('*');
            }
            //bottomMid
            for(int j=0;j<2*i+2;j++){
                System.out.print(" ");
            }
            //bottomRight
            for(int j=0;j<n-(i+1);j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

//Pattern - 16: Alpha-Ramp Pattern
// A
// BB
// CCC
// DDDD
// EEEEE
public class pattern16 {
    public static void alphaRampPattern(int n){
        char letter='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((char)(letter+i));
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        alphaRampPattern(5);
    }
}

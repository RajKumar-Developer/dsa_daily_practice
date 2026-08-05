//Pattern-15: Reverse Letter Triangle Pattern
// ABCDE
// ABCD
// ABC
// AB
// A
public class pattern15 {
    public static void revLetterTriangle(int n){
        char letter='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print((char)(letter+j));
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        revLetterTriangle(5);
    }
}

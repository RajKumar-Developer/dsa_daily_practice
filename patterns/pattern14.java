//Pattern-14: Increasing Letter Triangle Pattern
// A
// AB
// ABC
// ABCD
// ABCDE
public class pattern14 {
    public static void incLetterTriangle(int n){
        char count='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((char)(count+j));
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        incLetterTriangle(5);
    }
}

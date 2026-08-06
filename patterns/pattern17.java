// Pattern - 17: Alpha-Hill Pattern
public class pattern17 {
    public static void alphaHillPattern(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char letter ='A';
            int breakpoint = (2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(letter);
                if(j<=breakpoint){
                    letter++;
                }else{
                    letter--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaHillPattern(4);
    }
}

//Pattern - 6: Inverted Numbered Right Pyramid
public class pattern6 {
    public static void invertedNumberPyrimid(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){//j loop condition j > i
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedNumberPyrimid(5);
    }
}

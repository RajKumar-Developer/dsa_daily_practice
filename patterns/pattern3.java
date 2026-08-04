//Pattern - 3: Right-Angled Number Pyramid
public class pattern3 {
    public static void rightNumberPyrimid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rightNumberPyrimid(5);
    }
}

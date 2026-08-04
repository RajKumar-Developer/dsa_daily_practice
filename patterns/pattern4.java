//Right-Angled Number Pyramid - II
//1
//22
//333
//4444
//55555

public class pattern4 {
    public static void rightNumberPyrimid2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rightNumberPyrimid2(5);
    }
}

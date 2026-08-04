//Pattern-5: Inverted Right Pyramid
public class pattern5 {
    public static void invertedRightPyrimid(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){//j=n-i is a keypoint or the condition is j>i
                System.out.print("*");
            } 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRightPyrimid(5);
    }
}

//Pattern - 11: Binary Number Triangle Pattern
//1
//01
//101
//0101
//10101
public class pattern11 {
    public static void binaryNumberTriangle(int n){
        for(int i=0;i<n;i++){
            int start;
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=0;j<i+1;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        binaryNumberTriangle(5);
    }
}

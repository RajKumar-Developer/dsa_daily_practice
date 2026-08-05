//Pattern - 12: Number Crown Pattern
// 1       1
// 12     21
// 123   321
// 1234 4321
public class pattern12 {
    public static void numberCrownPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print(" ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberCrownPattern(4);
    }
}

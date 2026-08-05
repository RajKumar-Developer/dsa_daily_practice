//Pattern - 13: Increasing Number Triangle Pattern
// 1
// 23
// 456
// 78910
// 1112131415
public class pattern13 {
    public static void incNumTriangle(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        incNumTriangle(5);
    }
}

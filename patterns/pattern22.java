// Pattern - 22: The Number Pattern
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444
public class pattern22 {
    public static void main(String[] args) {
        numPattern(4);
    }

    private static void numPattern(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;//0 1 2 3 4 5 6
                int left=j;//0 1 2 3 4 5 6
                int bottom=(2*n-2)-i;//6 5 4 3 2 1 0
                int right = (2*n-2)-j;
                int minDist = Math.min(Math.min(top, bottom),Math.min(right, left));
                //System.out.print(top+" "+left+" "+bottom+" "+right+"="+minDist+"\n");
                System.out.print(n-minDist);
            }
            System.out.println();
        }
    }
}

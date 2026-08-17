package mathForDsa;

public class cyclicSortAlter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; 
        
        int missingNumber = findMissingUsingGates(arr);
        
        System.out.println("The missing number is: " + missingNumber); 
    }

    public static int findMissingUsingGates(int[] arr) {
        int xorRegister = 0;
        int n = arr.length + 1; 
        for (int i = 1; i <= n; i++) {
            xorRegister ^= i;
        }
        for (int num : arr) {
            xorRegister ^= num;
        }
        return xorRegister;
    }
}


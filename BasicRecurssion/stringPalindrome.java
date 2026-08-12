package BasicRecurssion;
// Check if the given String is Palindrome or not
public class stringPalindrome {
    public static void main(String[] args) {
        System.out.println(bruteforce("MALAYALAM")?"Palindrome":"Not A Palindrome");
        System.out.println(recurssionPalindrome(0,"MALYALAM")?"Palindrome":"Not A Palindrome");
        
    }
    public static boolean recurssionPalindrome(int i,String str){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
        return recurssionPalindrome(i+1, str);
    }
    public static boolean bruteforce(String str){
        int p1 = 0,p2 = str.length()-1;
        while(p1<p2){
            if(!Character.isLetterOrDigit(str.charAt(p1))){
                p1++;
            }else if(!Character.isLetterOrDigit(str.charAt(p2))){
                p2--;
            }else if(Character.toLowerCase(str.charAt(p1))!=Character.toLowerCase(str.charAt(p2))){
                return false;
            }else{
                p1++;
                p2--;
            }
        }
        return true;
    }
}

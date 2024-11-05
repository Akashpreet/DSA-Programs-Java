import java.util.HashSet;
import java.util.Set;

public class FindSubString {
    public static boolean palindrome(String str) {
        int x = 0;
        int y = str.length() - 1;
        while (x <= y) {
            if (str.charAt(x) != str.charAt(y)) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
    public static int length(String str){
        if(str.length()<1){
            return 0;
        }
        return str.length();
    }

    public static String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                if (check(j, j + i, s)) {
                    return s.substring(j, j + i);
                }
            }
        }
        return "";
    }

    public static boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "AABAAXBABABABXYAAX";
        // String subStr="name";
        // String subStr2="live";
        // for(int i=0;i<str.length();i++){
        // if(str.substring(i,i+subStr.length()).equals(subStr)){
        // System.out.println(i);
        // break;
        // }
        // }
        // for(int i=0;i<str.length();i++){
        // if(str.substring(i, i+subStr2.length()).equals(subStr2)){
        // System.out.println(i);
        // break;
        // }
        // }
        // if(str.indexOf(subStr)==1){
        // System.out.println("Not Found");
        // }
        // else{
        // System.out.println(str.indexOf(subStr));
        // }
        // if(str.indexOf(subStr2)==1){
        // System.out.println("Not Found");
        // }
        // else{
        // System.out.println(str.indexOf(subStr2));
        // }
        // String arr[]=str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (palindrome(str.substring(i, j))) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
        // String s=longestPalindrome(str);
        System.out.println(longestPalindrome(str));
        // String str2="AABAAXBABABABXYAAX";

    }
}

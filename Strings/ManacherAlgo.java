public class ManacherAlgo {
    private static String preProcessing(String str){
        StringBuilder sb=new StringBuilder("-#");
        for(char c: str.toCharArray()){
            sb.append(c);
            sb.append("#");
        }
        sb.append("&");
        return sb.toString();
    }
    public static String longestPalindrome(String s){
        String str=preProcessing(s);
        int r=0;//denoting the right boundary value of right most substring
        int c=0;//denoting center of rightmost string
        int n=str.length();
        int p[]=new int[n];// to store the length of palindrome at each position
        for(int i=1;i<n-1;i++){
            int mirr=2*c-i;
            if(i<r){
                p[i]=Math.min(r-i, p[mirr]);
            }
            while (str.charAt(i+p[i]+1)==str.charAt(i-p[i]-1)) {
                p[i]++;
            }
            if(i+p[i]>r){
                c=i;
                r=i+p[i];
            }
        }
        int maxLength=0;
        int center=0;
        for(int i=1;i<n-1;i++){
            if(p[i]>maxLength){
                maxLength=p[i];
                center=i;
            }
        }
        int start=(center-1-maxLength)/2;
        return s.substring(start,start+maxLength);
    }
    public static void main(String[] args) {
        String str="AABAACBAABCK";
        String res=longestPalindrome(str);
        System.out.println("Longest Palindromic string is: "+res);
    }
}

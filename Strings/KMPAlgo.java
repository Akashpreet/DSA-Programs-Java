public class KMPAlgo {
    public static int[] calcLps(String ptr){
        int m=ptr.length();
        int lps[]=new int[m];
        int len=0;//length of the longest prefix or suffix
        for(int i=1;i<m;){
            if(ptr.charAt(i)==ptr.charAt(len)){
                len++;
                lps[i]=len;
            }
            else if(len!=0){
                len=lps[len-1];
            }
            else{
                lps[i]=0;
                i++;
            }
        }
        return lps;
    }
    public static void searchPattern(String str, String ptr){
        int m=ptr.length();
        int n=str.length();
        int i=0;//for text
        int j=0;//for pattern
        int lps[]=calcLps(ptr);
        while (i<n) {
            if(ptr.charAt(j)==str.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println("Pattern Found at index: "+(i-j));
                j=lps[j-1];
            }
            else if(i<n && ptr.charAt(j)!=str.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
    }
   public static void main(String[] args) {
    String str="AABABADCAABABBAC";
    String ptr="AABAB";
    searchPattern(str,ptr);
   } 
}

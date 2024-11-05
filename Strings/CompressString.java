public class CompressString {
    public static void main(String[] args) {
        String str="aabbccccd@%^";
        String ans=""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            char prev=str.charAt(i-1);
            char curr=str.charAt(i);
            if(curr==prev){
                count++;
            }
            else{
                ans+=count;
                ans+=" ";
                count=1;
                ans+=curr;
            }
        }
        ans+=count;
        System.out.println(ans);
    }   
}

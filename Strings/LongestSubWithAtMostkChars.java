import java.util.HashMap;

public class LongestSubWithAtMostkChars {
    public static int maxLength(String str,int k){
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        while (j<str.length()) {
            char ch=str.charAt(i);
            if(map.size()<=k){
                map.put(ch,map.getOrDefault(ch, 0)+1);
                j++;
            }
            else{
                int count=map.get(str.charAt(i));
                map.put(str.charAt(i), count-1);
                if(count==1){
                    map.remove(str.charAt(i));
                }
                i++;
            }
            if(map.size()<=k){
                maxLen=Math.max(maxLen, j-i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str="abacdcdad";
        int k=3;
        int ans=maxLength(str, k);
        System.out.println(ans);
    }   
}

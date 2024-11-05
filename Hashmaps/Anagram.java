import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Anagram {
    public boolean isAnagram(String str1,String str2){
        Map<Character,Integer> mp=new HashMap<>();
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                Character ch=str1.charAt(i);
                if(!mp.containsKey(ch)){
                    return false;
                }
                int freq=mp.get(ch);
                mp.put(ch, freq-1);
            }
            // All values in map must be 0
            for(Integer i:mp.values()){
                if(i!=0){
                    return false;
                }
            }
            // return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
    }
}

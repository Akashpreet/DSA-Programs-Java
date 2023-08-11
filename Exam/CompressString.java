import java.util.*;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer>mp=new HashMap<>();
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(mp.containsKey(ch)==true){
                int val=mp.get(mp);
                mp.put(ch,val+1);
            }
            else{
                mp.put(ch,1);
            }
        }
        for(Map.Entry e:mp.entrySet()){
            System.out.println(e.getKey()+""+e.getValue());
        }
    }
}

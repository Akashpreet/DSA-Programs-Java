public class Vowel {
    public static boolean vowel(char s){
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
            return true;
        }
        return false;
    } 
    public static void main(String[] args) {
        String str="chbaeicdeaieopuaeiouaeiou";
        int count=0;
        int ans=0;
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(vowel(ch)){
                count++;
            }
            else{
                ans=Math.max(ans, count);
                count=0;
            }
        }
        System.out.println(Math.max(ans, count));
    }
}

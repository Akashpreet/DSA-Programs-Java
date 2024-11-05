public class StringPailndrome {
    public static boolean fun(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return fun(i+1, s);
    }
    public static void main(String[] args) {
        String s="madam";
        // fun(0,s);
        System.out.println(fun(0, s));
    }
}

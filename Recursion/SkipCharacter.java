public class SkipCharacter {
    static void skip(String str,String a){
        if(a.isEmpty()){
            System.out.println(str);
            return;
        }
        char ch=a.charAt(0);
        if(ch=='a'){
            skip(str, a.substring(1));
        }
        else{
            skip(str+ch, a.substring(1));
        }
    }
    public static void main(String[] args) {
        skip("", "baccadf");
    }
}

public class ReverseWord {

    public static void main(String[] args) {
        String str="My Name is Akashpreet Singh";
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb.delete(0, sb.length());
            }
        }
        // sb.append(" ");
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}

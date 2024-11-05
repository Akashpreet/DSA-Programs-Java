public class FindPattern {
    public static void main(String[] args) {
        String str="AABCAABBCAAABC";
        String ans="AAAB";
        boolean flag=false;
        for(int i=0;i<=str.length()-ans.length();i++){
            if(str.substring(i,i+ans.length()).equals(ans)){
                int a=ans.length()-1;
                System.out.println(i+" "+(i+a));
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("-1");
        }
    }
}

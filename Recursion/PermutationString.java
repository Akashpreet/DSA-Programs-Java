public class PermutationString {
    public static void printperm(String str,String Permutation) {
        if(str.length()==0){
            System.out.println(Permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            printperm(newStr, Permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printperm(str, "");
    }
}

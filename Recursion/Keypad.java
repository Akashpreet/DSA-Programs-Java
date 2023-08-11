public class Keypad {
    public static String[] key={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","xyz"};

    public static void printComb(String str,int idx,String combination) {
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=key[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="34";
        printComb(str, 0, "");
    }
}

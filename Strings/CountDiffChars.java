public class CountDiffChars {
    public static void main(String[] args) {
        String str="%@This is easy/-+25";
        int count=0;
        int counta=0;
        int countw=0;
        int countn=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                countw++;
            }
            else if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
                counta++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                countn++;
            }
            else{
                count++;
            }
        }
        System.out.println("Special Chars are "+count);
        System.out.println("Alpahbets are "+counta);
        System.out.println("White Spaces are "+countw);
        System.out.println("Numerical Values are "+countn);
    }
}

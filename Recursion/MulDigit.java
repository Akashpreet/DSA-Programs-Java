public class MulDigit {
    static int mul(int n){
        if((n%10)==n){
            return n;
        }
        return (n%10)*mul(n/10);
    }
    public static void main(String[] args) {
        System.out.println(mul(1342));
    }
}

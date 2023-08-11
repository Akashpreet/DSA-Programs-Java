public class ReduceSteps {
    static int fun(int n){
        return helper(n,0);
    } 
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2, c+1);
        }
        return helper(n-1, c+1);
    }
    public static void main(String[] args) {
        System.out.println(fun(41));
    }
}

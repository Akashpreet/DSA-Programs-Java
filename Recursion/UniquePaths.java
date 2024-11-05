public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(path(3, 7));
    }
    static int path(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=path(r-1, c);
        int right=path(r, c-1);
        return left+right;
    }
}

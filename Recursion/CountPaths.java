public class CountPaths {
    public static int MazePath(int i,int j,int n,int m) {
        if(i==n || j==m){
            return 0;
        }        
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPaths=MazePath(i+1, j, n, m);

        int upPaths=MazePath(i, j+1, n, m);

        return downPaths+upPaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int totalPaths=MazePath(0, 0, n, m);
        System.out.println(totalPaths);
    }
}

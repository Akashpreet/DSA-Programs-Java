public class AllPaths {
    static void paths(String str,boolean arr[][],int r,int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(str);
            return;
        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c]=false;
        if(r<arr.length-1){
            paths(str+'D', arr, r+1, c);
        }
        if(c<arr[0].length-1){
            paths(str+'R', arr, r, c+1);
        }
        if(r>0){
            paths(str+'U', arr, r-1, c);
        }
        if(c>0){
            paths(str+'L', arr, r, c-1);
        }
        arr[r][c]=true;
    }
    public static void main(String[] args) {
        boolean arr[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        paths(" ", arr, 0, 0);
    }
}

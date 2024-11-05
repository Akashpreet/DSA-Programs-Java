import java.util.Arrays;

public class PathPrint {
    static void path(String str,boolean[][] arr,int r,int c,int [][]paths,int step){
        if(r==arr.length-1 && c==arr[0].length-1){
            paths[r][c]=step;
            // System.out.println(str);
            for(int[] brr:paths){
                System.out.println(Arrays.toString(brr));
            }
            return;
        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c]=false;
        paths[r][c]=step;
        if(r<arr.length-1){
            path(str+'D', arr, r+1, c,paths,step+1);
        }
        if(c<arr[0].length-1){
            path(str+'R', arr, r, c+1,paths,step+1);
        }
        if(r>0){
            path(str+'U', arr, r-1, c,paths,step+1);
        }
        if(c>0){
            path(str+'L', arr, r, c-1,paths,step+1);
        }
        arr[r][c]=true;
        paths[r][c]=0;
    }
    public static void main(String[] args) {
        boolean arr[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        int [][] path=new int[arr.length][arr[0].length];
        path("", arr, 0, 0, path, 1);
    }
}

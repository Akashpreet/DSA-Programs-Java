// import Practice.animal;

public class Obstacles {
    public static void main(String[] args) {
        boolean[][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        // System. out.print(path(null, null, 0, 0););
        path(" ", board, 0, 0);
    }
    static void path(String str,boolean[][] arr,int r,int c){
        if(r==arr.length && c==arr[0].length){
            System.out.println(str);
            return;
        }
        if(!arr[r][c]){
            return;
        }
        if(r<arr.length-1){
            path(str+'D', arr, r+1, c);
        }
        if(c<arr[0].length-1){
            path(str+'R', arr, r, c+1);
        }
    }
}

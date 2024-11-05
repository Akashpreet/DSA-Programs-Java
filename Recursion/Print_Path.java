import java.util.*;
public class Print_Path {
    public static void main(String[] args) {
        // path(" ", 3, 3);
        System.out.println(pathSet(" ", 3, 3));
    }
    static void path(String str,int r,int c){
        if(r==1 && c==1){
            System.out.println(str);
            return;
        }
        if(r>1){
            path(str+'D', r-1, c);
        }
        if(c>1){
            path(str+'R', r, c-1);
        }
    }
    static ArrayList<String> pathSet(String str,int r,int c){
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1){
            list.addAll(pathSet(str+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathSet(str+'R', r, c-1));
        }
        return list;
    }
}

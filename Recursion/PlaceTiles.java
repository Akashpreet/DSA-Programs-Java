public class PlaceTiles {
    public static int Tiles(int n,int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertPalce=Tiles(n-m, m);

        int horiPlace=Tiles(n-1, m);

        return vertPalce+horiPlace;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(Tiles(n, m));
    }
}

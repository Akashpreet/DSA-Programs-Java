public class NoOfDice {
    public static void main(String[] args) {
            dice("", 4);
    }
    static void dice(String str,int target){
        if(target==0){
            System.out.println(str);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(str+i, target-i);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        write a java program which run on two threads one thread is used to print even numbers and one thread is used for printing the odd numbers
//        each thread has its own even odd runnable istance which help us to find whether to print even or odd boolean tag passed to the constructor

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean bool = input.nextBoolean();
        multiThreading object = new multiThreading(bool, n);
        object.start();
    }
    static class multiThreading extends Thread{
        boolean bool;
        int n;
        multiThreading(boolean bool, int n){
            this.bool = bool;
            this.n = n;
        }
        public void run(){
            try {
                if(bool){
                    for(int i = 1; i <= n; i++){
                        if(i % 2 == 0){
                            System.out.print(i + " ");
                        }
                        else{
                            System.out.println(i + "");
                        }
                    }
                }
            }
            catch (Exception e){
                System.out.println("Exception is caught");
            }
        }
    }
}

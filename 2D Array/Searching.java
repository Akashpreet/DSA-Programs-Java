import java.util.*;

public class Searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        System.out.println("Enter array: ");
        int [][] numbers=new int[rows][cols];
        // int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element that you want to search: ");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("Element found at ("+i+","+j+")");
                }
            }
        }
    }
}

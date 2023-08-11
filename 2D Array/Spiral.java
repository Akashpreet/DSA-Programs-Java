import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] numbers=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int rowStart=0;
        int rowEnd=rows-1;
        int colStart=0;
        int colEnd=cols-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++){
                System.out.print(numbers[rowStart][i]+" ");
            }
            rowStart++;

            for(int j=rowStart;j<=rowEnd;j++){
                System.out.print(numbers[j][colEnd]+" ");
            }
            colEnd--;
            for(int j=colEnd;j>=colStart;j--){
                System.out.print(numbers[rowEnd][j]+" ");
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(numbers[i][colStart]+" ");
            }
            colStart++;
            System.out.println();
        }
    }
}

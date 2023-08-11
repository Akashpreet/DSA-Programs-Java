import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter The Number of Rows: ");
       int numRows = input.nextInt();
       
       int[][] aditya = new int[numRows][];
       
       for (int i = 0; i < numRows; i++) {
          System.out.print("Enter the Number of Elements " + i + ": ");
          int numCols = input.nextInt();
          aditya[i] = new int[numCols];
          
          System.out.print("Enter The Elements " + i + ": ");
          for (int j = 0; j < numCols; j++) {
             aditya[i][j] = input.nextInt();
          }
       }
       
       System.out.println("\nJageed Array Table Below Dedi:");
       for (int i = 0; i < numRows; i++) {
          for (int j = 0; j < aditya[i].length; j++) {
             System.out.print(aditya[i][j] + " ");
          }
          System.out.println();
       }
       input.close();
    }
 }

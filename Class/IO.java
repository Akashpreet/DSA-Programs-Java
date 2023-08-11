import java.io.*;
public class IO {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("F:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

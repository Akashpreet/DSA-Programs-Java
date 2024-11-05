import java.util.Scanner;

public class StringBuilers {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder("Akashpreet Singh");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // sb.insert(0, 'A');
        // sb.insert(1, 'X');
        // System.out.println(sb);

        // sb.delete(1, 3);
        // System.out.println(sb);
        StringBuilder sb=new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());  
        sb.replace(0, 2,"ih");
        System.out.println(sb);
        String str="Hello";
        str.replace('H', 'x');
        System.out.println(str.replace('H', 'x'));  
        sb.reverse();
        System.out.println(sb);    
        sb.toString();
    }
}

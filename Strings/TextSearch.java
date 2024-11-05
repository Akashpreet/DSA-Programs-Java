import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextSearch {

    // KMP algorithm for pattern searching
    private static List<Integer> searchWord(String text, String pattern, boolean caseSensitive) {
        List<Integer> occurrences = new ArrayList<>();

        if (!caseSensitive) {
            text = text.toLowerCase();
            pattern = pattern.toLowerCase();
        }

        int[] lps = computeLPSArray(pattern);

        int i = 0;  
        int j = 0;  

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                occurrences.add(i - j);
                j = lps[j - 1];
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return occurrences;
    }

    private static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the word to search for: ");
        String wordToSearch = scanner.nextLine();

        System.out.print("Case-sensitive search? (yes/no): ");
        boolean caseSensitive = scanner.nextLine().equalsIgnoreCase("yes");

        List<Integer> occurrences = searchWord(text, wordToSearch, caseSensitive);

        if (occurrences.isEmpty()) {
            System.out.println("No occurrences found.");
        } else {
            System.out.println("Occurrences found at positions: " + occurrences);
        }

        scanner.close();
    }
}


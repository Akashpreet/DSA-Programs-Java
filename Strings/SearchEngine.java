import java.util.ArrayList;
import java.util.List;

public class SearchEngine {

    private static List<String> searchDocuments(List<String> documents, String keyword) {
        List<String> matchingDocuments = new ArrayList<>();

        for (String document : documents) {
            if (kmpSearch(document, keyword)) {
                matchingDocuments.add(document);
            }
        }

        return matchingDocuments;
    }

    private static boolean kmpSearch(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);

        int i = 0;  // index for text
        int j = 0;  // index for pattern

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                return true;  // Keyword found in the document
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return false;  // Keyword not found in the document
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
        List<String> documents = List.of(
                "Document 1: This is an example document containing keyword1.",
                "Document 2: Another document with keyword2.",
                "Document 3: No keyword here."
        );

        String keywordToSearch = "keyword1";

        List<String> matchingDocuments = searchDocuments(documents, keywordToSearch);

        if (matchingDocuments.isEmpty()) {
            System.out.println("No documents found containing the keyword.");
        } else {
            System.out.println("Documents containing the keyword: ");
            for (String document : matchingDocuments) {
                System.out.println(document);
            }
        }
    }
}


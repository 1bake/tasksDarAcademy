package bit.bakdaulet;

import java.util.Scanner;

public class CheckTwoStringToEquvalent {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3 words");
        String word1[] = {scanner.next(), scanner.next(), scanner.next()};
        System.out.println("ENter a 3 words");
        String word2[] = {scanner.next(), scanner.next(), scanner.next()};
        System.out.println(checkIfTwoStringAreEquivalent(word1,word2));
    }

    public static boolean checkIfTwoStringAreEquivalent( String[] word1, String[] word2) {
        String words1 = "";

        String words2 ="";

        for (int i=0;i<word1.length;i++)
        {
            words1+=word1[i];
        }
        for (int i=0;i<word2.length;i++)
        {
            words2+=word2[i];
        }
        return words1.equals(words2);
    }
}

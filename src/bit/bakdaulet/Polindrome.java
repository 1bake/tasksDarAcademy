package bit.bakdaulet;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        String naoborot = "";

        int strLength = text.length();

        for (int i = (strLength - 1); i >=0; --i) {
            naoborot = naoborot + text.charAt(i);
        }

        if (text.toLowerCase().equals(naoborot.toLowerCase())) {
            System.out.println(text + " True");
        }
        else {
            System.out.println(text + " False");
        }
    }
}

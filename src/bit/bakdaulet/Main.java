package bit.bakdaulet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 1 number");
        int a = scanner.nextInt();
        System.out.println("Enter a 2 number");
        int b = scanner.nextInt();
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a mod b ="+(a%b));


    }
}

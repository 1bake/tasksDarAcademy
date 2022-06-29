package bit.bakdaulet;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = scanner.nextInt();
        System.out.println("Enter a second number");
        int b = scanner.nextInt();
       int t = a;
       a = b;
       b = t;
        System.out.println(a+","+b);


    }
}

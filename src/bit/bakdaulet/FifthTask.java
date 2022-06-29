package bit.bakdaulet;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>0){
            System.out.println("Положительная");
        }else if(a<0){
            System.out.println("Отрицательная");
        }
    }
}

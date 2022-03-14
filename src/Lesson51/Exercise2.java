package Lesson51;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        show();
        var choice = 0;
        choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Nguyễn văn hải 1 ");
                    break;
                case 2:
                    System.out.println("Nguyễn văn hải 2 ");
                    break;
                default:
                    System.out.println("Sai chức năng ");
                    break;
            }
        } while (choice != 0);
    }

    private static void show() {
        System.out.println("Nguyễn Văn hải");
    }
}

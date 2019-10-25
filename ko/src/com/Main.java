package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int width = in.nextInt();
        char ch = in.next().charAt(0);
        int flag = in.nextInt();
        if (flag == 0) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == 0 || i == length - 1 ||
                            j == 0 || j == width - 1)
                        System.out.print(ch);
                    else
                        System.out.print(' ');
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
        in.close();
    }
}

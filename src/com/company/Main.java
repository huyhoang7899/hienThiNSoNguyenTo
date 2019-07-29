package com.company;

import java.util.Scanner;

public class Main {
    public static boolean ktSoNguyenTo(int number) {
        for (int i = 2; i  <  number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số : ");
        number = sc.nextInt();
        for (int i = 2; ; i++) {
            if (count == number) {
                break;
            }
            if (ktSoNguyenTo(i)) {
                System.out.println(i);
                count++;
            }
        }
    }
}


package com.pavan.Codeforces;

import java.util.Scanner;

public class C118B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++){
                for (int j = 1; j <= n-i ; j++) {
                    System.out.print("  ");
                }
                for (int num = 0; num <= i; num++) {
                    if(i == 0){
                        System.out.print(num);
                    }
                    else {
                        System.out.print(num + " ");
                    }

                }
                for (int num2 = i-1; num2 >= 0; num2--) {
                    if(num2 == 0){
                        System.out.print(num2);
                    }
                    else {
                        System.out.print(num2 + " ");
                    }
                }
            System.out.println();
        }
        for (int i = n; i > 0 ; i--) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("  ");

            }
            for (int num = 0; num < i; num++) {
                if(i == 1){
                    System.out.print(num);
                }
                else {
                    System.out.print(num + " ");
                }
            }
            for (int num2 = i-2; num2 >= 0; num2--) {
                if(num2 == 0){
                    System.out.print(num2);
                }
                else {
                    System.out.print(num2 + " ");
                }
            }

            System.out.println();
        }

        }
    }


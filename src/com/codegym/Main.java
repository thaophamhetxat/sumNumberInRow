package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        n = scanner.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("enter number in arr");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]= ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int row;
        System.out.println("enter a row: ");
        row = scanner.nextInt();
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==row){
                    sum = sum + arr[j][row];
                }
            }
        }
        System.out.println("sum in row: "+sum);



    }
}

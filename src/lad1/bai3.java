package lad1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh lập phương: ");
        int canh = sc.nextInt();
        System.out.print("Thể tích lập phương: " + (canh*canh*canh));
    }
}

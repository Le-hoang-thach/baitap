package lad1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String ten = sc.nextLine();
        System.out.print("Nhập điểm TB: ");
        double diemtb = sc.nextDouble();
        System.out.print(ten + " " + diemtb);
    }
}

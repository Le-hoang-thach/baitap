package lad1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int dai = sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int rong = sc.nextInt();
        int canhnhonhat = Math.min(dai, rong);
        System.out.print("Chu vi: " + ((dai+rong)*2) +"\n" );
        System.out.print("Diện tích: " + (dai*rong) + "\n");
        System.out.print("Cạnh nhỏ nhất: " + canhnhonhat);
    }
}

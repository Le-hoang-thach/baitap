package lad1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        Double delta = b*b - 4*a*c;
        Double candelta = Math.sqrt(delta);
        System.out.print("Delta :" + delta + "\n");
        System.out.print("Căn Delta :" + candelta);
    }
}

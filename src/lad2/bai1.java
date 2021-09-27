package lad2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = h.nextDouble();
        System.out.print("Nhập b: ");
        double b = h.nextDouble();
        if(a ==0 ){
            if( b == 0){
                System.out.print("Phương trình vô số nghiệm " + "\n");
            }else {
                System.out.print("Phương trình vô nghiệm " + "\n");
            }
        }else {
            double x = (-b/a);
            System.out.print("Phương trình có nghiệm: " + x);
        }
    }
}

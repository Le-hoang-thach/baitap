package lad2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.print("Phương trình vô nghiệm");
        }else if(delta == 0){
            double x = -b/(2*a);
            System.out.print("phương trình có nghiệm kép: " + x);
        }else if(delta > 0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.print("Phương trình có hai nghiệm :"+ "\n"+ "X1 = " + x1 + "\n" +"X2 = "+ x2);
        }
    }
}

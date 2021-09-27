package lad3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.print("Nhập số bảng cửu chương bạn muốn coi: ");
        int  n = h.nextInt();
        for(int i = 1 ; i <= 10;i++){
            System.out.print(n  + " x " + i + " = " +(n *i) + "\n");
        }
    }
}

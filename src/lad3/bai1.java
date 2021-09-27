package lad3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        int n = f.nextInt();
        if(n < 2 ){
            System.out.println(n +" không phải số nguyên tố");
        }
        int count = 0; 
        {
            for(int i = 2 ;i<n; i++){
                if(n % i == 0){
                   count ++;
                
                }
        }
        if(count == 0){
            System.out.println(n + " là số nguyên tố");
        }else {
            System.out.println(n + " không phải số nguyên tố");
            }
       
        }
    }
}
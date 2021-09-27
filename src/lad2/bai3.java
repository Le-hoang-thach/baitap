package lad2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int luachon;
        do{
            Scanner sc = new Scanner(System.in);
        System.out.println("========Menu========");
        System.out.println("+>1.Giải pt bậc 1   ");
        System.out.println("+>2.Giải pt bậc 2   ");
        System.out.println("+>3.Tính tiền điện  ");
        System.out.println("+>4.Thoát           ");
        System.out.println("====================");
        System.out.print("Mời lựa chọn : ");
         luachon = sc.nextInt();
        
            switch(luachon){
            case 1: ptbac1(); break;
            case 2: ptbac2();break;
            case 3: tiendien();break;
            case 4: System.out.print("Hẹn gặp lại ");break;
            default: System.out.print("Bạn chọn sai vui lòng chọn lại");break;
            }    
        }while(luachon !=4 );
    }
    static void ptbac1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        if(a ==0 ){
            if( b == 0){
                System.out.println("Phương trình vô số nghiệm " + "\n");
            }else {
                System.out.println("Phương trình vô nghiệm " + "\n");
            }
        }else {
            double x = (-b/a);
            System.out.println("Phương trình có nghiệm: " + x +"\n");
        }

    }
    static void ptbac2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if(delta == 0){
            double x = -b/(2*a);
            System.out.println("phương trình có nghiệm kép: " + x);
        }else if(delta > 0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có hai nghiệm :"+ "\n"+ "X1 = " + x1 + "\n" +"X2 = "+ x2);
        }

    }
    static void tiendien(){
        Scanner h = new Scanner(System.in);
        System.out.println("Nhập chỉ số mới = ");
        int chisomoi = h.nextInt();
        System.out.println("Nhập chỉ số cũ = ");
        int chisocu = h.nextInt();
        int soDien = chisomoi - chisocu;
        if(soDien <= 50){
            int tien = soDien*1000;
            System.out.printf("\n Tien = %d",tien);
        }else if(soDien > 50){
            int tien = 50*1000 + (soDien - 50)*1200;
            System.out.println("Tien = " + tien +"\n" );
        
    
        
        }

    }
}

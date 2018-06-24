package Bangcuuchuong;

import java.util.Scanner;

public class cuuchuong {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so:");
        int so = nhap.nextInt();
        for (int i=0; i<10; i++){
            System.out.println(so + "*" + (i+1) + "=" + (so*(i+1)));
        }
    }
}

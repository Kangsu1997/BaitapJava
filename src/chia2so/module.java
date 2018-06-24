package chia2so;

import java.util.Scanner;

public class module {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        int so1 = nhap.nextInt();
        System.out.println("Nhap so thu hai:");
        int so2 = nhap.nextInt();
        int chia = so1/so2;
        int kq = so1 - (chia*so2);
        System.out.println("Ket qua:" + kq);
    }
}

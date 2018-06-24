package tong2so;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println(" Nhap so thu nhat:");
        int so1 = nhap.nextInt();
        System.out.println("Nhap so hai:");
        int so2 = nhap.nextInt();
        int tong = so1 + so2;
        System.out.println();
        System.out.println("Tong: "+tong);
    }
}

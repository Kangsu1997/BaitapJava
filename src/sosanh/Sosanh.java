package sosanh;

import java.util.Scanner;

public class Sosanh {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        int so1 = nhap.nextInt();
        System.out.println("Nhap so thu hai: ");
        int so2 = nhap.nextInt();
        if (so1 == so2){
            System.out.printf("%d == %d\n", so1, so2);
        }
        if (so1 != so2){
            System.out.printf("%d != %d\n", so1, so2);
        }
        if (so1 >= so2){
            System.out.printf("%d >= %d\n", so1, so2);
        }
        if (so1 <= so2){
            System.out.printf("%d <= %d\n", so1, so2);
        }
        if (so1 > so2){
            System.out.printf("%d > %d\n", so1, so2);
        }
        if (so1 < so2){
            System.out.printf("%d < %d\n", so1, so2);
        }
    }
}

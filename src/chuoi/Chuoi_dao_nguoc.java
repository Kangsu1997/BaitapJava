package chuoi;

import java.util.Scanner;

public class Chuoi_dao_nguoc {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        char[] kytu = nhap.nextLine().toCharArray();
        System.out.println("Chuoi dao nguoc: ");
        for (int i = kytu.length-1; i>=0; i--){
            System.out.print(kytu[i]);
        }
        System.out.println("\n");
    }
}

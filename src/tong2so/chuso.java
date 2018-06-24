package tong2so;

import java.util.Scanner;

public class chuso {
    public static int Tong(long so){
        int tong = 0;
        while (so != 0){
            tong += so%10;
            so/=10;
        }
        return tong;
    }

    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so:");
        int so = nhap.nextInt();
        System.out.println("Tong:"+ Tong(so));
    }
}

package tinh2so;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        int so1 = nhap.nextInt();
        System.out.println("Nhap so thu hai:");
        int so2 = nhap.nextInt();
        int tong = so1 + so2;
        int tru = so1 - so2;
        int nhan = so1 * so2;
        int chia = so1 / so2;
        int du = so1 % so2;
        System.out.printf("Tong = %d\nTru = %d\nNhan = %d\nChia = %d\nDu = %d\n", tong, tru, nhan, chia, du);
    }
}

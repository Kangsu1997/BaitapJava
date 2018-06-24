package tinh2so;

import java.util.Scanner;

public class Tinh {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int so1 = nhap.nextInt();
        System.out.println("Nhap so thu hai: ");
        int so2 = nhap.nextInt();
        System.out.println(so1 + "+" + so2 + "=" + (so1 + so2));
        System.out.println(so1 + "-" + so2 + "=" + (so1 - so2));
        System.out.println(so1 + "*" + so2 + "=" + (so1 * so2));
        System.out.println(so1 + "/" + so2 + "=" + (so1 / so2));
        System.out.println(so1 + "%" + so2 + "=" + (so1 % so2));
    }
}

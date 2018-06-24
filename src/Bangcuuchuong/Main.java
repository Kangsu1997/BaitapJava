package Bangcuuchuong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so:");
        int so = nhap.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(so + "*" + i + "=" + (so*i));
        }
    }
}

package khoangcach;

import java.util.Scanner;

public class Kinh_Vido {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vi do thu nhat: ");
        double vi1 = nhap.nextDouble();
        System.out.println("Nhap kinh do thu nhat: ");
        double kinh1 = nhap.nextDouble();
        System.out.println("Nhap vi do thu hai: ");
        double vi2 = nhap.nextDouble();
        System.out.println("Nhap kinh do thu nhat: ");
        double kinh2 = nhap.nextDouble();
        System.out.println("Khoang cach giua hai diem: " + khoang_cach(vi1, kinh1, vi2, kinh2)+ "km\n");
    }
    public static double khoang_cach(double vi1, double kinh1, double vi2, double kinh2){
        vi1 = Math.toRadians(vi1);
        kinh1 = Math.toRadians(kinh1);
        vi2 = Math.toRadians(vi2);
        kinh2 = Math.toRadians(kinh2);
        double r = 6371.01;
        return r * Math.acos(Math.sin(vi1) * Math.sin(vi2) + Math.cos(vi1) * Math.cos(vi2) * Math.cos(kinh1 - kinh2));
    }
}

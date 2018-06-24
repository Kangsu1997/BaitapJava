package dt_polygon;

import java.util.Scanner;

public class polygon {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so side:");
        int so = nhap.nextInt();
        System.out.println("Nhap do dai side:");
        double dodai = nhap.nextDouble();
        System.out.println("Dien tich:" + dt_polygon(so, dodai));
    }
    public static double dt_polygon(int so, double dodai){
        return ((so*(dodai*dodai))/(4*Math.tan(Math.PI/so)));
    }
}

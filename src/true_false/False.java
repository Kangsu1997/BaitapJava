package true_false;

import java.util.Scanner;

public class False {
    public static void main(String[] args)
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int x = nhap.nextInt();
        System.out.print("Nhap so thu hai: ");
        int y = nhap.nextInt();
        System.out.print("Nhap so thu ba: ");
        int z = nhap.nextInt();
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
}

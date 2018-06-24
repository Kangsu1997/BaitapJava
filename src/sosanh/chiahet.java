package sosanh;

import java.util.Scanner;

public class chiahet {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int a = in.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = in.nextInt();
        System.out.println("Ket qua: "+ketqua(a, b));
    }
    public static int ketqua(int x, int y)
    {
        if(x == y)
            return 0;
        if(x % 6 == y % 6)
            return (x < y) ? x : y;
        return (x > y) ? x : y;
    }
}

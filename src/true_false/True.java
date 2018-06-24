package true_false;

import java.util.Scanner;

public class True {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int x = in.nextInt();
        System.out.print("Nhap so thu hai: ");
        int y = in.nextInt();
        System.out.print("Nhap so thu ba : ");
        int z = in.nextInt();
        System.out.print("Ket qua la: "+kiemtra(x, y, z,true));
        System.out.print("\n");
    }

    public static boolean kiemtra(int p, int q, int r, boolean xyz)
    {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}

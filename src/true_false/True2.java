package true_false;

import java.util.Scanner;

public class True2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhapso thu nhat : ");
        int a = in.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = in.nextInt();
        System.out.println("Result: "+ketqua(a, b));
    }


    public static boolean ketqua(int p, int q) {
        if (p < 25 || q > 75)
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);
    }
}
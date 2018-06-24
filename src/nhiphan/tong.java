package nhiphan;

import java.util.Scanner;

public class tong {
    public static void main(String[] args)
    {
        long so1, so2;
        int i = 0, conlai = 0;
        int[] sum = new int[20];
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        so1 = nhap.nextLong();
        System.out.print("Nhap so thu hai: ");
        so2 = nhap.nextLong();

        while (so1 != 0 || so2 != 0)
        {
            sum[i++] = (int)((so1 % 10 + so2 % 10 + conlai) % 2);
            conlai = (int)((so1 % 10 + so2 % 10 + conlai) / 2);
            so1 = so1 / 10;
            so2 = so2 / 10;
        }
        if (conlai != 0) {
            sum[i++] = conlai;
        }
        --i;
        System.out.print("Tong 2 so nhi phan: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}

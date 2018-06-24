package tong2so;

public class Tong100so {
    public static void main(String[] args)
    {
        int sum = 1;
        int ctr = 0;
        int n = 0;

        while (ctr < 100) {
            n++;
            if (n % 2 != 0) {
                if (is_Prime(n)) {
                    sum += n;
                    ctr++;
                }
            }
        }
        System.out.println("\nTong 100 so dau: "+sum);
    }

    public static boolean is_Prime(int n) {
        for (int i = 3; i * i <= n; i+= 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

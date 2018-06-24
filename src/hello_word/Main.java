package hello_word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten dau:");
        String dau = input.next();
        System.out.println("Nhap ten cuoi:");
        String cuoi = input.next();
        System.out.println();
        System.out.println("Hello \n"+dau+" "+cuoi);

    }
}

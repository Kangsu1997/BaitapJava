package chuoi;

public class Demchu {
    public static void main(String[] args){
        String text = " Da Nang ngay 5 thang 4 nam 2018";
        count(text);
    }

    private static void count(String x) {
        char[] ch = x.toCharArray();
        int kytu = 0, so = 0, khoang_cach = 0, khac = 0;
        for (int i = 0; i<x.length(); i++){
            if (Character.isLetter(ch[i])){
                kytu ++;
            }
            else if (Character.isDigit(ch[i])){
                so ++ ;
            }
            else if (Character.isSpaceChar(ch[i])){
                khoang_cach ++ ;
            }
            else{
                khac ++ ;
            }
        }
        System.out.println("Da Nang ngay 5 thang 4 nam 2018");
        System.out.println("Ky tu:" + kytu);
        System.out.println("So:" + so);
        System.out.println("Khoang cach:" + khoang_cach);
        System.out.println("Khac: " + khac);

    }
}

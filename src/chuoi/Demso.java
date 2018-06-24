package chuoi;

public class Demso {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                for(int k = 1; k <= 3; k++){
                    if(k != i && k != j && i != j){
                        count++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Tong so lan: " + count);
    }
}

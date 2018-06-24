package password;

import java.io.Console;

public class Password {
    public static void main(String[] args){
        Console cons;
        if ((cons = System.console()) != null) {
            char[] pass = null;
            try {
                pass = cons.readPassword("Nhap Password:");
                System.out.println("Password la: " + new String(pass));
            } finally {
                if (pass != null) {
                    java.util.Arrays.fill(pass, ' ');
                }
            }
        } else {
            throw new RuntimeException("Khong lay duoc password");
        }
    }
}

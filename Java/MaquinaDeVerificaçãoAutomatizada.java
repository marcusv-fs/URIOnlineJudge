
import java.util.Scanner;

public class MaquinaDeVerificaçãoAutomatizada {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a1, a2, a3, a4, a5;
        int b1, b2, b3, b4, b5;
        String r = "N";

        a1 = s.nextInt();
        a2 = s.nextInt();
        a3 = s.nextInt();
        a4 = s.nextInt();
        a5 = s.nextInt();

        b1 = s.nextInt();
        b2 = s.nextInt();
        b3 = s.nextInt();
        b4 = s.nextInt();
        b5 = s.nextInt();

        if (a1 != b1) {
            if (a2 != b2) {
                if (a3 != b3) {
                    if (a4 != b4) {
                        if (a5 != b5) {
                            r = "Y";
                        }
                    }
                }
            }
        }

        System.out.println(r);

    }
}

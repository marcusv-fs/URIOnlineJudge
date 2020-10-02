
import java.util.Scanner;

public class VaiNaSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a, cont = 0, cont2 = 0;
        int b[] = new int[50];
        boolean ordem = false;
        while (n != 0) {
            a = s.nextInt();

            do {
                for (int i = 0; i < a; i++) {
                    b[i] = s.nextInt();
                }
                for (int i = 0; i < a - 1; i++) {
                    if(b[i] < b[i +1]){
                        cont++;
                    }
                    if(b[i] > b[i +1]){
                        cont2++;
                    }
                }
                if (cont2 == a){
                    ordem = true;
                }
            } while (ordem != true);
            System.out.println(cont);
        }
    }

}

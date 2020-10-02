
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marcu
 */
public class CálculoSimples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cod, qtd;
        double vl, tot = 0;

        for (int i = 0; i < 2; i++) {
            cod = s.nextInt();
            qtd = s.nextInt();
            vl = s.nextDouble();
            tot = tot + (vl * qtd);
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f", tot);
        System.out.println();
    }
}

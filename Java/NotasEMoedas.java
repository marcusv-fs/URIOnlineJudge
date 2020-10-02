
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
public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double vl = s.nextDouble(), qtd;
        
        System.out.println("NOTAS:");
        qtd = vl /100;
        vl = vl % 100; 
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" nota(s) de R$ 100.00");  
        qtd = vl /50;
        vl = vl % 50;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" nota(s) de R$ 50.00");
        qtd = vl /20;
        vl = vl % 20;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" nota(s) de R$ 20.00");
        qtd = vl /10;
        vl = vl % 10;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" nota(s) de R$ 10.00");
        qtd = vl /5;
        vl = vl % 5;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" nota(s) de R$ 5.00");
        qtd = vl /2;
        vl = vl % 2;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        qtd = vl /1;
        vl = vl % 1;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" moeda(s) de R$ 1.00");
        qtd = vl /0.5;
        vl = vl % 0.5;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" moeda(s) de R$ 0.50");
        qtd = vl /0.25;
        vl = vl % 0.25;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" moeda(s) de R$ 0.25");
        qtd = vl /0.1;
        vl = vl % 0.1;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" moeda(s) de R$ 0.10");
        qtd = vl /0.05;
        vl = vl % 0.05;
        qtd = Math.floor(qtd);
        System.out.printf("%.0f", qtd);
        System.out.println(" moeda(s) de R$ 0.05");
        qtd = vl /0.01;
        System.out.printf("%.0f", qtd);
        System.out.println(" moeda(s) de R$ 0.01");
    }
}

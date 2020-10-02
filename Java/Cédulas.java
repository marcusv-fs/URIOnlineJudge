
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
public class Cédulas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vl = s.nextInt(), qtd;
        
        System.out.println(vl);
        qtd = vl /100;
        vl = vl % 100;        
        System.out.println(qtd + " nota(s) de R$ 100,00");        
        qtd = vl /50;
        vl = vl % 50;
        System.out.println(qtd + " nota(s) de R$ 50,00");
        qtd = vl /20;
        vl = vl % 20;
        System.out.println(qtd + " nota(s) de R$ 20,00");
        qtd = vl /10;
        vl = vl % 10;
        System.out.println(qtd + " nota(s) de R$ 10,00");
        qtd = vl /5;
        vl = vl % 5;
        System.out.println(qtd + " nota(s) de R$ 5,00");
        qtd = vl /2;
        vl = vl % 2;
        System.out.println(qtd + " nota(s) de R$ 2,00");
        qtd = vl /1;
        System.out.println(qtd + " nota(s) de R$ 1,00");
    }
}

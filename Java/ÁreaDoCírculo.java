
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
public class ÁreaDoCírculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double res, raio;
        Scanner s = new Scanner(System.in);
        raio = s.nextDouble();
        res = (raio * raio * 3.14159);
        System.out.printf("A=%.4f", res);
        System.out.println("");
    }

}

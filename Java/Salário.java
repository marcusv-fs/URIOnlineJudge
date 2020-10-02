
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
public class Salário {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, horas;
        double sal, vph;
        
        num = s.nextInt();
        horas = s.nextInt();
        vph = s.nextDouble();
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f", vph * horas);
        System.out.println("");
    }
    
}


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
public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, m, d = s.nextInt();
        
        a = d / 365;
        d = d % 365;
        
        m = d / 30;
        d = d % 30;
        
        System.out.println(a + " ano(s)\n" + m + " mes(es)\n" + d + " dia(s)");
        
    }
    
}


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
public class Media1 {
    public static void main(String[] args) {
        double a,b, res;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        
        res = ((a * 3.5) + (b * 7.5))/11;
        
        System.out.printf("MEDIA = %.5f", res);
        System.out.println("");
    }
    
}

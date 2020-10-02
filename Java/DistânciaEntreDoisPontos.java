
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
public class DistânciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1, x2, y1, y2, res;
        
        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();
    
        res = (Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));
        System.out.printf("%.4f", res);
        System.out.println("");
    }
}

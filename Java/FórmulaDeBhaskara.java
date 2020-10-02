
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
public class FórmulaDeBhaskara {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a, b, c, x1, x2, t;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        t = (b * b) - (4 * a * c);
        
        if (t > 0 && a != 0) {
            x1 = ((b * -1) + Math.sqrt(t))/(2 * a);
            x2 = ((b * -1) - Math.sqrt(t))/(2 * a);
            
            System.out.printf("R1 = %.5f", x1);
            System.out.printf("\nR2 = %.5f", x2);
            System.out.println("");
            
        }else{
            System.out.println("Impossivel calcular");
        }       
    }
}

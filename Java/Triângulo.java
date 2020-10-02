
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
public class Triângulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;
        
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        
        if(a < (b + c) && b < (a + c) && c < (a + b)){
            System.out.printf("Perimetro = %.1f%n", (a + b + c));
        }else{
            System.out.printf("Area = %.1f%n", (((a + b) * c)) / 2);
        }
    }
}

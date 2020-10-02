
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
public class TiposDeTriângulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c, temp;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        if (b > a && b > c) {
            temp = a;
            a = b;
            b = temp;
        } else if (c > a && c > b) {
            temp = a;
            a = c;
            c = temp;
        }
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((a * a) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (a == b && a != c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (a == c && a != b) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (c == b && a != b) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}

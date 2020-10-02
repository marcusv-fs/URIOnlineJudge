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
public class ReceitaDeBolo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        a = a / 2;
        b = b / 3;
        c = c / 5;
        
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

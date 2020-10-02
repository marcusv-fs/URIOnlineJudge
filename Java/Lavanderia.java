/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author marcu
 */
public class Lavanderia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, la, lb, sa, sb;

        n = s.nextInt();

        la = s.nextInt();
        lb = s.nextInt();
        sa = s.nextInt();
        sb = s.nextInt();

        if (n >= la && n <= lb && n >= sa && n <= sb) {
            System.out.println("possivel");
        } else {
            System.out.println("impossivel");
        }
    }
    
}

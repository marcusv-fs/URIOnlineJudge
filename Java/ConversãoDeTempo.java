
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
public class ConversãoDeTempo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h, m, sec = s.nextInt();
        
        h = sec / 3600;
        sec = sec % 3600;
        
        m = sec / 60;
        sec = sec % 60;
        
        System.out.println(h + ":" + m + ":" + sec);
    }
}

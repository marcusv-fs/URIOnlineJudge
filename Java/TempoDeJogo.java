
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
public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, f;
        
        i = s.nextInt();
        f = s.nextInt();
        
        if(i == f){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(i < f){
            System.out.println("O JOGO DUROU " + (f - i) + " HORA(S)");        
        }else{
            System.out.println("O JOGO DUROU " + ((24 - i) + f) + " HORA(S)");
        }
    }
    
}

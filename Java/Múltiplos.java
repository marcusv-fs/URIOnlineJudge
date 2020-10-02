
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
public class Múltiplos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        
        a = s.nextInt();
        b = s.nextInt();
        
        if (a % b == 0){
            System.out.println("Sao Multiplos");
        }else if(b % a == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }    
}

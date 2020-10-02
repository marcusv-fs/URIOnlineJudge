
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
public class GastoDeCombustível {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tempo, vm;
        double dist;
        
        tempo = s.nextInt();
        vm = s.nextInt();
        dist = tempo * vm;
        
        System.out.printf("%.3f", dist / 12);
        System.out.println("");
    }
    
}

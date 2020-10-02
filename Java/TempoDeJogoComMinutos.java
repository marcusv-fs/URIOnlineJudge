
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
public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ih, im, fh, fm;
        
        ih = s.nextInt();
        im = s.nextInt();
        fh = s.nextInt();
        fm = s.nextInt();
        
        if(ih == fh){
            if(im > fm){
                System.out.println("O JOGO DUROU 23 HORA(S) E " + ((60 - im) + fm) + " MINUTO(S)");
            }else if (im < fm){
                 System.out.println("O JOGO DUROU 0 HORA(S) E " + (fm - im) + " MINUTO(S)");
            }else{
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
        }else if(ih > fh){
            if(im > fm){
                System.out.println("O JOGO DUROU " + ((24 - ih) + fh - 1) + " HORA(S) E " + ((60 - im) + fm) + " MINUTO(S)");
            }else if(im < fm){
                System.out.println("O JOGO DUROU " + ((24 - ih) + fh) + " HORA(S) E " + (fm - im) + " MINUTO(S)");
            }else{
                System.out.println("O JOGO DUROU " + ((24 - ih) + fh) + " HORA(S) E 0 MINUTO(S)");
            }
        }else{
            if(im > fm){
                System.out.println("O JOGO DUROU " + ((fh - ih) - 1) + " HORA(S) E " + ((60 - im) + fm) + " MINUTO(S)");
            }else if(im < fm){
                System.out.println("O JOGO DUROU " + (fh - ih) + " HORA(S) E " + (fm - im) + " MINUTO(S)");
            }else{
                System.out.println("O JOGO DUROU " + (fh - ih) + " HORA(S) E 0 MINUTO(S)");
            }
        }
    }
}

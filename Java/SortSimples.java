
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
public class SortSimples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        if (a < b && a < c){
            if(b < c){
                System.out.println(a + "\n" + b + "\n" + c);
                
            }else{
                System.out.println(a + "\n" + c + "\n" + b);
            }
        }else if (b < c){
            if(a < c){
                System.out.println(b + "\n" + a + "\n" + c);
            }else{
                System.out.println(b + "\n" + c + "\n" + a);
            }
        }else{
            if(a < b){
                System.out.println(c + "\n" + a + "\n" + b);
            }else{
                System.out.println(c + "\n" + b + "\n" + a);
            }
        }
        System.out.println("\n" + a + "\n" + b + "\n" + c);
    }
}

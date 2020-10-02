
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
public class OMaior {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int a, b ,c;
        
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    
        if(a > b && a > c){
            System.out.println(a + " eh o maior");
        }else if(b > c){
            System.out.println(b + " eh o maior");
        }else{
            System.out.println(c + " eh o maior");
        } 
    }
}

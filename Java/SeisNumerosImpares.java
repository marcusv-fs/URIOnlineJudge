
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
public class SeisNumerosImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        if(num %2 == 0){
            num++;
            for(int i = 0; i < 6; i++){
                System.out.println(num);
                num += 2;
            }
        }else{
            for(int i = 0; i < 6; i++){
                System.out.println(num);
                num += 2;
            }
        }
    }  
}

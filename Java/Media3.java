
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
public class Media3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float num, som;

        num = s.nextFloat();
        som = num * 2;
        num = s.nextFloat();
        som = som + num * 3;
        num = s.nextFloat();
        som = som + num * 4;
        num = s.nextFloat();
        som = som + num * 1;

        som = som / 10;
        System.out.printf("Media: %.1f%n", som);

        if (som < 5) {
            System.out.println("Aluno reprovado.");
        }else if(som >= 7){
            System.out.println("Aluno aprovado.");
        }else{
            System.out.println("Aluno em exame.");
            num = s.nextFloat();
            System.out.println("Nota do exame: " + num);
            som = (som + num)/2;
            
            if(som > 4.9){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            
            System.out.printf("Media final: %.1f", som);
            System.out.println("");
        }
    }
}


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
public class CoordenadasDeUmPonto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float coord;

        coord = s.nextFloat();

        if (coord > 0) {
            coord = s.nextFloat();
            if (coord > 0) {
                System.out.println("Q1");
            } else if (coord == 0) {
                System.out.println("Eixo X");
            } else {
                System.out.println("Q4");
            }
        } else if (coord == 0) {
            coord = s.nextFloat();
            if (coord == 0) {
                System.out.println("Origem");
            } else {
                System.out.println("Eixo Y");
            }
        } else {
            coord = s.nextFloat();
            if (coord > 0) {
                System.out.println("Q2");
            } else if (coord == 0) {
                System.out.println("Eixo X");
            } else {
                System.out.println("Q3");
            }
        }
    }
}

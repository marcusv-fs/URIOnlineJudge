import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Esfera {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double tot, r;
        
        r = s.nextDouble();
        tot = (r * r * r) * 3.14159 * (4.0 / 3.0);
        
        System.out.printf("VOLUME = %.3f", tot);
        System.out.println("");
    }
}
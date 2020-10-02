import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class AumentoDeSalário {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sal = s.nextDouble();

        if (sal <= 400) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.15));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.15));
            System.out.println("Em percentual: 15 %");
        } else if (sal <= 800) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.12));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.12));
            System.out.println("Em percentual: 12 %");
        } else if (sal <= 1200) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.1));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.1));
            System.out.println("Em percentual: 10 %");
        } else if (sal <= 2000) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.07));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.07));
            System.out.println("Em percentual: 7 %");
        } else {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.04));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.04));
            System.out.println("Em percentual: 4 %");
        }
    }
}

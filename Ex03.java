import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void Ex03() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            double n1 = sc.nextInt();
            double result = Math.sqrt(n1);
            System.out.println("A raiz quadrada de " + n1 + " é " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: Digite um número válido");
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite um número real");
        }
    }
}

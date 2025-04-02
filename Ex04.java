import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
    public static void Ex04() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            double n1 = sc.nextByte();
            System.out.println("Digite o segundo número: ");
            double n2 = sc.nextByte();

            double result = n1 + n2;

            System.out.println(n1 + " + " + n2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite um número real!");
        }
    }
}

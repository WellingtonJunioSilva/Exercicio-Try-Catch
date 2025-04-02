import java.util.Scanner;

public class Ex02 {
    public static void Ex02() {
    Scanner sc = new Scanner(System.in);

    try {
        System.out.println("Digite um número:");
        String entrada = sc.nextLine();

        int numero = Integer.parseInt(entrada);
        System.out.println("Você digitou o número: " + numero);

    } catch (NumberFormatException e) {
        System.out.println("Erro: Entrada inválida. Certifique-se de digitar um número válido.");
    }
}
}

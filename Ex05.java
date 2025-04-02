import java.util.Scanner;

public class Ex05 {
    public static void Ex05() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.println("Digite um índice para acessar o array (0 a 4): ");
            int indice = sc.nextInt();

            int valor = numeros[indice];
            System.out.println("O valor no índice " + indice + " é " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites do array. Digite um valor entre 0 e 4.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
        }
    }
}

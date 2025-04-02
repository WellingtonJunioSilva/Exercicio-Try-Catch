import java.util.Scanner;

public class Ex01 {
    public static void Ex01() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();

            int result = n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possivel dividir um número por zero.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        } finally {
            sc.close();
        }
    }
}

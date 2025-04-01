
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {

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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha uma questão:");
            System.out.println("1:Divisão por zero.");
            System.out.println("2:Conversão de String para número");
            System.out.println("3:Raiz quadrada de um número");
            System.out.println("4:Soma de Dois Números");
            System.out.println("5:Acesso a Índice Inválido em um Array");
            System.out.println("6:");
            System.out.println("7:");
            System.out.println("8:");
            System.out.println("9:");
            System.out.println("10:");

            questao = sc.nextInt();

            switch (questao) {
                case 1:
                    Ex01();
                    break;
                case 2:
                    Ex02();
                    break;
                case 3:
                    Ex03();
                    break;
                case 4:
                    Ex04();
                    break;
                case 5:
                    Ex05();
                    break;

                case 0:
                    System.out.println("Obrigado por acessar");
                    break;
                default:
                    System.out.println("Erro. Digite uma opção válida");
                    break;
            }
        } while (questao != 0);
    }
}



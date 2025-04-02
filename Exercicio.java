import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {
    public static void Exibir() {
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
                    new Ex01();
                    break;
                case 2:
                    new Ex02();
                    break;
                case 3:
                    new Ex03();
                    break;
                case 4:
                    new Ex04();
                    break;
                case 5:
                    new Ex05();
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


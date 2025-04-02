import java.util.Scanner;

public class Ex06 {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.println("Digite a idade: ");
                int idade = scanner.nextInt();
                System.out.println("Nome: " + nome + "\n idade: " + idade);

            } catch (DadosInvalidosException e) {
                // Captura e exibe a exceção personalizada
                System.out.println(e.getMessage());
            } catch (Exception e) {
                // Captura outras exceções
                System.out.println("Erro: Entrada inválida. Certifique-se de digitar os dados corretamente.");
            } finally {
                // Fecha o scanner
                scanner.close();
            }
        }
    

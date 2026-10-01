package boardgames;

import boardgames.euro_games;

import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    euro_games jogo = new euro_games(350.00, "Clank", 4);

    int opcao = 0;

    do {
        System.out.println("\n--- MENU EURO GAMES ---");
        System.out.println("1. Alterar dados");
        System.out.println("2. Retornar dados");
        System.out.println("3. Encerrar");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("\n--- ALTERAR DADOS ---");
                System.out.print("Digite o novo nome: ");
                jogo.nome = scanner.nextLine();

                System.out.print("Digite o novo valor: ");
                jogo.valor = scanner.nextDouble();

                System.out.print("Digite a nova quantidade de pessoas: ");
                jogo.quantPessoas = scanner.nextInt();

                System.out.println("Dados alterados com sucesso!");
                break;

            case 2:
                System.out.println("\n--- DADOS ATUAIS ---");
                System.out.println("Nome: " + jogo.nome);
                System.out.println("Valor: R$ " + jogo.valor);
                System.out.println("Quantidade de Pessoas: " + jogo.quantPessoas);
                break;

            case 3:
                System.out.println("Encerrando o aplicativo...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    } while (opcao != 3);

    scanner.close();
}

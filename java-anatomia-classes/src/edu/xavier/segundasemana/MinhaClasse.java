package edu.xavier.segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Concatenar nomes");
            System.out.println("2. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número

            if (opcao == 1) {
                System.out.println("Digite o primeiro nome:");
                String primeiroNome = scanner.nextLine();
                System.out.println("Digite o segundo nome:");
                String segundoNome = scanner.nextLine();

                String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
                System.out.println("Nome completo: " + nomeCompleto);
            } else if (opcao == 2) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }    

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }
}

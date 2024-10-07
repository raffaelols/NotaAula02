import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        System.out.println("Bem-vindo ao Sistema Bancário!");
        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();

        System.out.println("Selecione o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();

        switch (tipoConta) {
            case 1:
                conta = new ContaCorrente(titular);
                break;
            case 2:
                conta = new ContaPoupanca(titular);
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        int opcao = 0;
        do {
            System.out.println("\nMenu de opções:");
            if (conta instanceof ContaCorrente) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Usar cheque especial");
                System.out.println("4. Exibir dados da conta");
                System.out.println("5. Sair");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Calcular rendimento");
                System.out.println("4. Exibir dados da conta");
                System.out.println("5. Sair");
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depositar:");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar:");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    if (conta instanceof ContaCorrente) {
                        System.out.println("Digite o valor do cheque especial a utilizar:");
                        double valorCheque = scanner.nextDouble();
                        ((ContaCorrente) conta).usarChequeEspecial(valorCheque);
                    } else if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).calcularRendimento();
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}

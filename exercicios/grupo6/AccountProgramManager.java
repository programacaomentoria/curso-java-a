package exercicios.grupo6;

public class AccountProgramManager {
     public static void main(String[] args) {
        int opcaoNavegacao;
        do {
            opcaoNavegacao = MenuNavegacao.exibirMenuInicial();
            switch (opcaoNavegacao) {
                case 1:
                    MenuNavegacao.exibirFormularioCriacaoConta();
                    break;
                case 2:
                    System.out.println("Recuperando dados da conta...");
                    boolean contaReconhecida = false;
                    do {
                        if (!contaReconhecida) {
                            System.out.println("Conta não reconhecida. Tente novamente.");
                        }
                        // scanner.close(); // Evitar fechar o scanner aqui para não fechar System.in
                    } while(!contaReconhecida);

                    int submenu = MenuNavegacao.exibirMenuConta();
                    switch (submenu) {
                        case 1:
                            System.out.println("Depositando dinheiro na conta...");
                            break;
                        case 2:
                            System.out.println("Sacando dinheiro da conta...");
                            break;
                        case 3:
                            System.out.println("Exibindo saldo da conta...");
                            break;
                        case 4:
                            System.out.println("Exibindo extrato da conta...");
                            break;
                        case 0:
                            continue;
                        default:
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Saindo do Gerenciador de Contas Bancárias.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcaoNavegacao != 0);
        MenuNavegacao.fecharScanner();
    }

    class MenuNavegacao{
        static java.util.Scanner scanner = new java.util.Scanner(System.in);

        public static int exibirMenuInicial() {
            System.out.println("=== Gerenciador de Contas Bancárias ===");
            System.out.println("1. Criar Conta");
            System.out.println("2. Recuperar dados da Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            return opcao;
        }

        public static boolean reconhecerConta(String cpf) {
            System.out.print("Digite o CPF da conta: ");
            String cpfInput = scanner.nextLine();
            boolean contaReconhecida = AccountManager.checarSeContaExiste(cpfInput);
            return contaReconhecida; // Simulação de autenticação bem-sucedida
        }

        public static int exibirMenuConta() {
            System.out.println("=== Menu da Conta ===");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Saldo");
            System.out.println("4. Exibir Extrato");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            
            return opcao;
        }

        public static void exibirFormularioCriacaoConta() {
            scanner.nextLine();
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.nextLine();
            System.out.print("Digite o número da agência: ");
            
            System.out.println("Nome " + nome);
            System.out.println("CPF " + cpf);
            System.out.println("Cliente cadastrado com sucesso!");
            // Aqui você implementaria a lógica real de criação de conta com os dados fornecidos
        }

        public static void fecharScanner() {
            scanner.close();
        }
    }
}

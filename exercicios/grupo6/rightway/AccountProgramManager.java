package exercicios.grupo6.rightway;

import exercicios.grupo6.rightway.model.Account;
import exercicios.grupo6.rightway.model.AccountManager;

public class AccountProgramManager {
     public static void main(String[] args) {
        int opcaoNavegacao;
        do {
            opcaoNavegacao = MenuNavegacao.exibirMenuInicial();
            switch (opcaoNavegacao) {
                case 1:
                    MenuNavegacao.exibirEProcessarFormularioCriacaoConta();
                    break;
                case 2:
                    System.out.println("Recuperando dados da conta...");
                    boolean contaReconhecida = MenuNavegacao.exibirMenuLoginConta();
                    if(!contaReconhecida) break;

                    int submenu = 0;
                    do{
                        submenu = MenuNavegacao.exibirMenuConta();
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
                                break;
                            default:
                                System.out.println("Opção inválida no menu da conta. Tente novamente.");
                        }
                    } while(submenu != 0);
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

        public static Account reconhecerConta() {
            scanner.nextLine();
            System.out.print("Digite o CPF da conta: ");
            String cpfInput = scanner.nextLine();
            return AccountManager.getInstance().carregarConta(cpfInput);
        }

        public static boolean exibirMenuLoginConta(){
            boolean contaReconhecida = false;
            Account contaCarregada = null;
            while(!contaReconhecida) {
                contaCarregada = MenuNavegacao.reconhecerConta();
                contaReconhecida = contaCarregada != null;
                if (!contaReconhecida) {
                    System.out.println("Conta não reconhecida. Tente novamente. Caso não queira tentar, digite 'sair' para voltar ao menu principal.");
                    String tentativa = MenuNavegacao.scanner.nextLine();
                    if(tentativa.equalsIgnoreCase("sair")){
                        break;
                    }
                }
                else{
                    //RECUPERAR OS DADOS DA CONTA
                    System.out.println("Bem vindo de volta, " + contaCarregada.getNomeDaConta() + "!");
                }
                // scanner.close(); // Evitar fechar o scanner aqui para não fechar System.in
            }
            return contaReconhecida;
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

        public static void exibirEProcessarFormularioCriacaoConta() {
            scanner.nextLine();
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.nextLine();

            //FALTA GRAVAR A INFORMACAO NO ARQUIVO
            boolean resultadoProcessamento = AccountManager.getInstance().criarConta(cpf, nome);
            if(resultadoProcessamento){
                System.out.println("Conta criada e salva com sucesso!");
            }
            else{
                System.err.println("Houve um erro ao criar a conta. Verifique os dados e tente novamente. Caso o erro persista, entre em contato com o suporte.");
            }
        }

        public static void fecharScanner() {
            scanner.close();
        }
    }
}

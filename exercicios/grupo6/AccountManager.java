package exercicios.grupo6;

public class AccountManager {
   public static boolean transferir(Account contaOrigem, Account contaDestino, double valorTransferencia) {
        if (valorTransferencia > 0 && contaOrigem.getSaldo() >= valorTransferencia) {
            contaOrigem.sacar(valorTransferencia);
            contaDestino.depositar(valorTransferencia);
            return true;
        } else {
            System.out.println("Transferência inválida: saldo insuficiente ou valor indevido.");
            return false;
        }
    }

    public static void main(String[] args) {
        Account conta1 = new Account(1000.0);
        Account conta2 = new Account(500.0);

        System.out.println("Saldo inicial da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo inicial da conta 2: " + conta2.getSaldo());

        boolean sucesso = transferir(conta1, conta2, 200.0);
        if (sucesso) {
            System.out.println("Transferência realizada com sucesso.");
        }

        System.out.println("Saldo final da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo final da conta 2: " + conta2.getSaldo());
    }

    public static boolean checarSeContaExiste(String cpfBuscado) {
        AccountFileManager gerenciador = new AccountFileManager();
        return gerenciador.existeContaNoArquivo(cpfBuscado) ; // Suponha que a conta não foi encontrada
    }

    public static boolean criarConta(String cpf, String nomeDaConta, int numeroAgencia, String numeroConta) {
        AccountFileManager gerenciador = new AccountFileManager();
        AccountRecord novaConta = new AccountRecord();
        novaConta.cpf = cpf;
        novaConta.nomeDaConta = nomeDaConta;
        novaConta.numeroAgencia = numeroAgencia;
        novaConta.numeroConta = numeroConta;

        return gerenciador.salvarContaEmArquivo(novaConta) != null;
    }

}

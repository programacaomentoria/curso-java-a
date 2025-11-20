package exercicios.grupo6.rightway.model;

import exercicios.grupo6.rightway.model.exception.AccountNotFoundException;
import exercicios.grupo6.rightway.model.io.AccountFileManager;

public class AccountManager {

    private static AccountManager instance = null;
    private AccountFileManager gerenciador;

    private AccountManager() {
        // Construtor privado para evitar instanciação
        gerenciador = new AccountFileManager();
    }

    public static AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    public boolean checarSeContaExiste(String cpfBuscado) {
        return this.gerenciador.existeContaNoArquivo(cpfBuscado); // Suponha que a conta não foi encontrada
    }

    public Account carregarConta(String cpfBuscado) {
        Account conta = null;
        try{
            conta = this.gerenciador.carregarContaEGerarInstancia(cpfBuscado); // Suponha que a conta não foi encontrada
        }
        catch(AccountNotFoundException ex){
            System.err.println("Erro ao carregar a conta: " + ex.getMessage());
        }
        return conta;
    }

    public boolean criarConta(String cpf, String nomeDaConta) {
        if (this.gerenciador.existeContaNoArquivo(cpf)) {
            System.out.println("Já existe uma conta cadastrada com o CPF informado.");
            return false;
        }

        Account novaConta = new Account(nomeDaConta, cpf, 0.0, true);
        return this.gerenciador.salvarConta(novaConta);
    }

    public boolean transferir(Account contaOrigem, Account contaDestino, double valorTransferencia) {
        if (valorTransferencia > 0 && contaOrigem.getSaldo() >= valorTransferencia) {
            contaOrigem.sacar(valorTransferencia);
            contaDestino.depositar(valorTransferencia);
            return true;
        } else {
            System.err.println("Transferência inválida: saldo insuficiente ou valor indevido.");
            return false;
        }
    }



}

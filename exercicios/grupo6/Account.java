package exercicios.grupo6;

import java.util.ArrayList;

public class Account {
    protected double saldo;
    protected String nomeDaConta;
    protected String cpf;
    protected int numeroAgencia;
    protected String numeroConta;
    protected ArrayList<AccountMovement> historicoMovimentacoes = new ArrayList<>();

    public Account(){
        this.saldo = 0.0;
    }

    public Account(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public Account(String nomeDaConta, String cpf, int numeroAgencia, String numeroConta, double saldoInicial, ArrayList<AccountMovement> historicoMovimentacoes) {
        this.nomeDaConta = nomeDaConta;
        this.cpf = cpf;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historicoMovimentacoes = historicoMovimentacoes;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            this.historicoMovimentacoes.add(new AccountMovement("Depósito", valorDeposito, java.time.LocalDate.now().toString()));
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            this.historicoMovimentacoes.add(new AccountMovement("Saque", valorSaque, java.time.LocalDate.now().toString()));
        } else {
            System.out.println("Saldo insuficiente ou valor indevido para saque.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}

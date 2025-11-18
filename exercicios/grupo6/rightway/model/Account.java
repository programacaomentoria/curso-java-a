package exercicios.grupo6.rightway.model;

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

    public Account (String nome, String cpf, double saldoInicial, boolean ehContaNova){ 
        this.nomeDaConta = nome;
        this.cpf = cpf;
        this.saldo = saldoInicial;
        if(ehContaNova){
            this.saldo = 0;
            this.numeroAgencia = 00001;
            this.numeroConta = this.generateAccountNumber(String.valueOf(this.numeroAgencia), cpf);
            this.historicoMovimentacoes.add(new AccountMovement(AccountMovement.TipoMovimentacao.ABERTURA_CONTA.name(), saldoInicial, java.time.LocalDate.now().toString()));
            if(saldoInicial > 0){
                this.depositar(saldoInicial);
            }
        }
    }

    private String generateAccountNumber(String numeroAgencia, String cpf){
        return numeroAgencia + cpf.substring(cpf.length() - 4) + "-" + (int)(Math.random() * 9000 + 1000);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNomeDaConta() {
        return nomeDaConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNomeDaConta(String nomeDaConta) {
        this.nomeDaConta = nomeDaConta;
    }

    public ArrayList<AccountMovement> getHistoricoMovimentacoes() {
        return historicoMovimentacoes;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            AccountMovement movimentoDeposito = new AccountMovement(AccountMovement.TipoMovimentacao.DEPOSITO.name(), valorDeposito, java.time.LocalDate.now().toString());
            this.historicoMovimentacoes.add(movimentoDeposito);
        } else {
            System.err.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            AccountMovement movimentoSaque = new AccountMovement(AccountMovement.TipoMovimentacao.SAQUE.name(), valorSaque, java.time.LocalDate.now().toString());
            this.historicoMovimentacoes.add(movimentoSaque);
        } else {
            System.err.println("Saldo insuficiente ou valor indevido para saque.");
        }
    }
}

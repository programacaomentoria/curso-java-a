package exercicios.grupo6;

public class AccountRecord extends Account {
    public AccountRecord cadastrarDadosNovaConta(String nome, String cpf, double saldoInicial){ 
        AccountRecord novaConta = new AccountRecord();
        novaConta.nomeDaConta = nome;
        novaConta.cpf = cpf;
        novaConta.saldo = saldoInicial;
        novaConta.numeroAgencia = 00001;
        novaConta.numeroConta = this.cpf.substring(4, 6) + "45-6";
        novaConta.historicoMovimentacoes.add(new AccountMovement("Nova Conta", 0, java.time.LocalDate.now().toString()));
        return novaConta;
    }

}

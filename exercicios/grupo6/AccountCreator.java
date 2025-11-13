package exercicios.grupo6;

public class AccountCreator {
    public Account criarConta(String cpf, String nome) {
        AccountFileManager checkConta = new AccountFileManager();

        if(!checkConta.existeContaNoArquivo(cpf)){
            Account novaConta = new Account();
            novaConta.cpf = cpf;
            novaConta.nomeDaConta = nome;
            return novaConta;
        }

        return null;
    }
}

package exercicios.grupo6;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String cpf) {
        super("Conta com CPF " + cpf + " não encontrada no cadastro." );
    }
}

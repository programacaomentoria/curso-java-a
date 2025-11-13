package exercicios.grupo6;

public class AccountAlreadyExistsException extends Exception {
    public AccountAlreadyExistsException(String cpf){
        super("Conta com o CPF " + cpf + " já cadastrado.");
    }
}

package exercicios.grupo6.rightway.model.exception;

public class AccountAlreadyExistsException extends Exception {
    public AccountAlreadyExistsException(String cpf){
        super("Conta com o CPF " + cpf + " já cadastrado.");
    }
}

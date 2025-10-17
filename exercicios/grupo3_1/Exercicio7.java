/**
 * Validação de Senha Simples: Peça ao usuário para digitar uma senha. 
 * Continue pedindo a senha até que ele digite "secreta123".
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo3_1;

import java.util.Scanner;

public class Exercicio7 {
    private static final String SENHA_SECRETA = "secreta123";

    public static boolean isSenhaValida(String senha) {
        return senha.equals(SENHA_SECRETA);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean senhaValida = false;
        int qtdeDeTentativasErradas = 0;
        do{
            System.out.println("Digite a senha para validar: ");
            String senhaDigitada = scanner.nextLine();
            senhaValida = isSenhaValida(senhaDigitada);
            if (!senhaValida) {
                System.out.println("Senha inválida. Tente novamente.");
            }
            else {
                System.out.println("Senha correta!");
            }
            qtdeDeTentativasErradas++;
        } while (!senhaValida);
        System.out.println("Tentativas: " + qtdeDeTentativasErradas);

        scanner.close();
    }
}

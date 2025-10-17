/**
 * Acesso ao Sistema: Um sistema requer que a senha tenha no mínimo 6 caracteres. Peça uma senha e
informe se ela é "Válida" ou "Inválida".
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio20 {

    public static Boolean isSenhaComplexa(String checkSenha) {
        return (checkSenha.length() >= 6);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma senha para verificar se é válida ou não: ");
        String pwd = scanner.nextLine();
        boolean isComplexa = isSenhaComplexa(pwd);
        String mensagemSenhaValida = "A senha digitada é: " + (isComplexa ? "Válida" : "Inválida");
        System.out.println(mensagemSenhaValida);
        scanner.close();
    }
}
